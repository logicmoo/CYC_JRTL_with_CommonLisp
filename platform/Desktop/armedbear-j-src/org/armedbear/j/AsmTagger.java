/*
 * AsmTagger.java
 *
 * Copyright (C) 2015 Peter Graves
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.armedbear.j;

import java.util.ArrayList;

public final class AsmTagger extends Tagger
{
  public AsmTagger(SystemBuffer buffer)
  {
    super(buffer);
  }

  private final LocalTag checkForExplicitTag(Position pos)
  {
    final String explicitTag =
      Editor.preferences().getStringProperty(Property.EXPLICIT_TAG);
    if (explicitTag != null && explicitTag.length() > 0)
      {
        pos = pos.copy();
        String s = pos.getString(); // Substring to end of line.
        int index = s.indexOf(explicitTag);
        if (index >= 0)
          {
            pos.skip(index + explicitTag.length());
            pos.skipWhitespace();
            // Now we're looking at the first character of the tag.
            FastStringBuffer sb = new FastStringBuffer();
            char c = pos.getChar();
            // Explicit tags are whitespace-delimited.
            sb.append(c);
            while (pos.next())
              {
                c = pos.getChar();
                if (Character.isWhitespace(c))
                  break;
                sb.append(c);
              }
            final String tag = sb.toString();
            // Exact location of tag is beginning of text on line
            // containing tag.
            pos.setOffset(0);
            pos.skipWhitespace();
            return new LocalTag(tag, pos);
          }
      }
    return null;
  }

  public void run()
  {
    ArrayList tags = new ArrayList();
    Line line = buffer.getFirstLine();
    while (line != null)
      {
        String s =
          Utilities.detab(line.getText(), 8).trim(); // tab width doesn't matter
        if (s != null)
          {
            if (s.startsWith(";"))
              {
                LocalTag tag = checkForExplicitTag(new Position(line, 0));
                if (tag != null)
                  tags.add(tag);
              }
            else if (s.startsWith("%macro "))
              {
                String name = null;
                s = s.substring(6).trim();
                int index = s.indexOf(' ');
                if (index > 0)
                  name = s.substring(0, index);
                else
                  name = s;
                if (name != null)
                  tags.add(new LocalTag(name, line));
              }
            line = line.next();
          }
      }
    buffer.setTags(tags);
  }
}
