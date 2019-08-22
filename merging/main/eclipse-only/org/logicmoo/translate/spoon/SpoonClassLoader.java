/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.logicmoo.translate.spoon;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

public class SpoonClassLoader extends ClassLoader {
	public final File directory;

	public SpoonClassLoader(ClassLoader classLoader, File directory) {
		super(classLoader);
		this.directory = directory;
	}

	public SpoonClassLoader(File directory) {
		this.directory = directory;
	}

	@Override
	public Class loadClass(String name) throws ClassNotFoundException {
		try {
			final File file = new File(directory, name.replaceAll("\\.", "/") + ".class");

			if (!file.exists()) {
				return super.loadClass(name);
			}

			ByteArrayOutputStream buffer;
			try (InputStream input = new FileInputStream(file)) {
				buffer = new ByteArrayOutputStream();
				int data = input.read();
				while (data != -1) {
					buffer.write(data);
					data = input.read();
				}
			}
			final byte[] classData = buffer.toByteArray();

			return defineClass(name, classData, 0, classData.length);
		} catch (final MalformedURLException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}