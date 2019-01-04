package org.appdapter.core.store;

import java.util.regex.Pattern;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Comparator;

public class ExtendedFileLoading
{
    public static class Paths implements Iterable<String>
    {
        private static final Comparator<Path> LONGEST_TO_SHORTEST;
        private static List<String> defaultGlobExcludes;
        final HashSet<Path> paths;

        public Paths() {
            this.paths = new HashSet<Path>(32);
        }

        public Paths(final String dir, final String... patterns) {
            this.paths = new HashSet<Path>(32);
            this.glob(dir, patterns);
        }

        public Paths(final String dir, final List<String> patterns) {
            this.paths = new HashSet<Path>(32);
            this.glob(dir, patterns);
        }

        private Paths glob(String dir, final boolean ignoreCase, String... patterns) {
            if (dir == null) {
                dir = ".";
            }
            if (patterns != null && patterns.length == 0) {
                final String[] split = dir.split("\\|");
                if (split.length > 1) {
                    dir = split[0];
                    patterns = new String[split.length - 1];
                    for (int i = 1, n = split.length; i < n; ++i) {
                        patterns[i - 1] = split[i];
                    }
                }
            }
            final File dirFile = new File(dir);
            if (!dirFile.exists()) {
                return this;
            }
            final List<String> includes = new ArrayList<String>();
            final List<String> excludes = new ArrayList<String>();
            if (patterns != null) {
                for (final String pattern : patterns) {
                    if (pattern.charAt(0) == '!') {
                        excludes.add(pattern.substring(1));
                    }
                    else {
                        includes.add(pattern);
                    }
                }
            }
            if (includes.isEmpty()) {
                includes.add("**");
            }
            if (Paths.defaultGlobExcludes != null) {
                excludes.addAll(Paths.defaultGlobExcludes);
            }
            final GlobScanner scanner = new GlobScanner(dirFile, includes, excludes, ignoreCase);
            String rootDir = scanner.rootDir().getPath().replace('\\', '/');
            if (!rootDir.endsWith("/")) {
                rootDir += '/';
            }
            for (final String filePath : scanner.matches()) {
                this.paths.add(new Path(rootDir, filePath));
            }
            return this;
        }

        public Paths glob(final String dir, final String... patterns) {
            return this.glob(dir, false, patterns);
        }

        public Paths globIgnoreCase(final String dir, final String... patterns) {
            return this.glob(dir, true, patterns);
        }

        public Paths glob(final String dir, final List<String> patterns) {
            if (patterns == null) {
                throw new IllegalArgumentException("patterns cannot be null.");
            }
            this.glob(dir, false, (String[])patterns.toArray(new String[patterns.size()]));
            return this;
        }

        public Paths globIgnoreCase(final String dir, final List<String> patterns) {
            if (patterns == null) {
                throw new IllegalArgumentException("patterns cannot be null.");
            }
            this.glob(dir, true, (String[])patterns.toArray(new String[patterns.size()]));
            return this;
        }

        public Paths regex(String dir, String... patterns) {
            if (dir == null) {
                dir = ".";
            }
            if (patterns != null && patterns.length == 0) {
                final String[] split = dir.split("\\|");
                if (split.length > 1) {
                    dir = split[0];
                    patterns = new String[split.length - 1];
                    for (int i = 1, n = split.length; i < n; ++i) {
                        patterns[i - 1] = split[i];
                    }
                }
            }
            final File dirFile = new File(dir);
            if (!dirFile.exists()) {
                return this;
            }
            final List<String> includes = new ArrayList<String>();
            final List<String> excludes = new ArrayList<String>();
            if (patterns != null) {
                for (final String pattern : patterns) {
                    if (pattern.charAt(0) == '!') {
                        excludes.add(pattern.substring(1));
                    }
                    else {
                        includes.add(pattern);
                    }
                }
            }
            if (includes.isEmpty()) {
                includes.add(".*");
            }
            final RegexScanner scanner = new RegexScanner(dirFile, includes, excludes);
            String rootDir = scanner.rootDir().getPath().replace('\\', '/');
            if (!rootDir.endsWith("/")) {
                rootDir += '/';
            }
            for (final String filePath : scanner.matches()) {
                this.paths.add(new Path(rootDir, filePath));
            }
            return this;
        }

        public Paths copyTo(final String destDir) throws IOException {
            final Paths newPaths = new Paths();
            for (final Path path : this.paths) {
                final File destFile = new File(destDir, path.name);
                final File srcFile = path.file();
                if (srcFile.isDirectory()) {
                    destFile.mkdirs();
                }
                else {
                    destFile.getParentFile().mkdirs();
                    copyFile(srcFile, destFile);
                }
                newPaths.paths.add(new Path(destDir, path.name));
            }
            return newPaths;
        }

        public boolean delete() {
            boolean success = true;
            final List<Path> pathsCopy = new ArrayList<Path>(this.paths);
            Collections.sort(pathsCopy, Paths.LONGEST_TO_SHORTEST);
            for (final File file : this.getFiles(pathsCopy)) {
                if (file.isDirectory()) {
                    if (deleteDirectory(file)) {
                        continue;
                    }
                    success = false;
                }
                else {
                    if (file.delete()) {
                        continue;
                    }
                    success = false;
                }
            }
            return success;
        }

        public void zip(final String destFile) throws IOException {
            final Paths zipPaths = this.filesOnly();
            if (zipPaths.paths.isEmpty()) {
                return;
            }
            final byte[] buf = new byte[1024];
            final ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destFile));
            out.setLevel(9);
            try {
                for (final Path path : zipPaths.paths) {
                    final File file = path.file();
                    out.putNextEntry(new ZipEntry(path.name.replace('\\', '/')));
                    final FileInputStream in = new FileInputStream(file);
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    in.close();
                    out.closeEntry();
                }
            }
            finally {
                out.close();
            }
        }

        public int count() {
            return this.paths.size();
        }

        public boolean isEmpty() {
            return this.paths.isEmpty();
        }

        public String toString(final String delimiter) {
            final StringBuffer buffer = new StringBuffer(256);
            for (final String path : this.getPaths()) {
                if (buffer.length() > 0) {
                    buffer.append(delimiter);
                }
                buffer.append(path);
            }
            return buffer.toString();
        }

        @Override
        public String toString() {
            return this.toString(", ");
        }

        public Paths flatten() {
            final Paths newPaths = new Paths();
            for (final Path path : this.paths) {
                final File file = path.file();
                if (file.isFile()) {
                    newPaths.paths.add(new Path(file.getParent(), file.getName()));
                }
            }
            return newPaths;
        }

        public Paths filesOnly() {
            final Paths newPaths = new Paths();
            for (final Path path : this.paths) {
                if (path.file().isFile()) {
                    newPaths.paths.add(path);
                }
            }
            return newPaths;
        }

        public Paths dirsOnly() {
            final Paths newPaths = new Paths();
            for (final Path path : this.paths) {
                if (path.file().isDirectory()) {
                    newPaths.paths.add(path);
                }
            }
            return newPaths;
        }

        public List<File> getFiles() {
            return this.getFiles(new ArrayList<Path>(this.paths));
        }

        private ArrayList<File> getFiles(final List<Path> paths) {
            final ArrayList<File> files = new ArrayList<File>(paths.size());
            for (final Path path : paths) {
                files.add(path.file());
            }
            return files;
        }

        public List<String> getRelativePaths() {
            final ArrayList<String> stringPaths = new ArrayList<String>(this.paths.size());
            for (final Path path : this.paths) {
                stringPaths.add(path.name);
            }
            return stringPaths;
        }

        public List<String> getPaths() {
            final ArrayList<String> stringPaths = new ArrayList<String>(this.paths.size());
            for (final File file : this.getFiles()) {
                stringPaths.add(file.getPath());
            }
            return stringPaths;
        }

        public List<String> getNames() {
            final ArrayList<String> stringPaths = new ArrayList<String>(this.paths.size());
            for (final File file : this.getFiles()) {
                stringPaths.add(file.getName());
            }
            return stringPaths;
        }

        public Paths addFile(final String fullPath) {
            final File file = new File(fullPath);
            final String parent = file.getParent();
            this.paths.add(new Path((parent == null) ? "" : parent, file.getName()));
            return this;
        }

        public Paths add(final String dir, final String name) {
            this.paths.add(new Path(dir, name));
            return this;
        }

        public void add(final Paths paths) {
            this.paths.addAll((Collection)paths.paths);
        }

        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {
                private Iterator<Path> iter = Paths.this.paths.iterator();

                @Override
                public void remove() {
                    this.iter.remove();
                }

                @Override
                public String next() {
                    return this.iter.next().absolute();
                }

                @Override
                public boolean hasNext() {
                    return this.iter.hasNext();
                }
            };
        }

        public Iterator<File> fileIterator() {
            return new Iterator<File>() {
                private Iterator<Path> iter = Paths.this.paths.iterator();

                @Override
                public void remove() {
                    this.iter.remove();
                }

                @Override
                public File next() {
                    return this.iter.next().file();
                }

                @Override
                public boolean hasNext() {
                    return this.iter.hasNext();
                }
            };
        }

        public static void setDefaultGlobExcludes(final String... defaultGlobExcludes) {
            Paths.defaultGlobExcludes = Arrays.asList(defaultGlobExcludes);
        }

        private static void copyFile(final File in, final File out) throws IOException {
            final FileInputStream sourceStream = new FileInputStream(in);
            final FileOutputStream destinationStream = new FileOutputStream(out);
            final FileChannel sourceChannel = sourceStream.getChannel();
            final FileChannel destinationChannel = destinationStream.getChannel();
            sourceChannel.transferTo(0L, sourceChannel.size(), destinationChannel);
            sourceChannel.close();
            sourceStream.close();
            destinationChannel.close();
            destinationStream.close();
        }

        private static boolean deleteDirectory(final File file) {
            if (file.exists()) {
                final File[] files = file.listFiles();
                for (int i = 0, n = files.length; i < n; ++i) {
                    if (files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    }
                    else {
                        files[i].delete();
                    }
                }
            }
            return file.delete();
        }

        static {
            LONGEST_TO_SHORTEST = new Comparator<Path>() {
                @Override
                public int compare(final Path s1, final Path s2) {
                    return s2.absolute().length() - s1.absolute().length();
                }
            };
        }

        static class GlobScanner
        {
            private final File rootDir;
            private final List<String> matches;

            public GlobScanner(File rootDir, final List<String> includes, final List<String> excludes, final boolean ignoreCase) {
                this.matches = new ArrayList<String>(128);
                if (rootDir == null) {
                    throw new IllegalArgumentException("rootDir cannot be null.");
                }
                if (!rootDir.exists()) {
                    throw new IllegalArgumentException("Directory does not exist: " + rootDir);
                }
                if (!rootDir.isDirectory()) {
                    throw new IllegalArgumentException("File must be a directory: " + rootDir);
                }
                try {
                    rootDir = rootDir.getCanonicalFile();
                }
                catch (IOException ex) {
                    throw new RuntimeException("OS error determining canonical path: " + rootDir, ex);
                }
                this.rootDir = rootDir;
                if (includes == null) {
                    throw new IllegalArgumentException("includes cannot be null.");
                }
                if (excludes == null) {
                    throw new IllegalArgumentException("excludes cannot be null.");
                }
                if (includes.isEmpty()) {
                    includes.add("**");
                }
                final List<Pattern> includePatterns = new ArrayList<Pattern>(includes.size());
                for (final String include : includes) {
                    includePatterns.add(new Pattern(include, ignoreCase));
                }
                final List<Pattern> allExcludePatterns = new ArrayList<Pattern>(excludes.size());
                for (final String exclude : excludes) {
                    allExcludePatterns.add(new Pattern(exclude, ignoreCase));
                }
                this.scanDir(rootDir, includePatterns);
                if (!allExcludePatterns.isEmpty()) {
                    final Iterator matchIter = this.matches.iterator();
                Label_0352:
                    while (true) {
                        while (matchIter.hasNext()) {
                            final String filePath = (String) matchIter.next();
                            final List<Pattern> excludePatterns = new ArrayList<Pattern>(allExcludePatterns);
                            try {
                                final Iterator excludeIter = excludePatterns.iterator();
                                while (excludeIter.hasNext()) {
                                    final Pattern exclude2 = (Pattern) excludeIter.next();
                                    if (exclude2.values.length == 2 && exclude2.values[0].equals("**")) {
                                        exclude2.incr();
                                        final String fileName = filePath.substring(filePath.lastIndexOf(File.separatorChar) + 1);
                                        if (exclude2.matches(fileName)) {
                                            matchIter.remove();
                                            continue Label_0352;
                                        }
                                        excludeIter.remove();
                                    }
                                }
                                final String[] arr$;
                                final String[] fileNames = arr$ = filePath.split("\\" + File.separator);
                                for (final String fileName2 : arr$) {
                                    final Iterator excludeIter2 = excludePatterns.iterator();
                                    while (excludeIter2.hasNext()) {
                                        final Pattern exclude3 = (Pattern) excludeIter2.next();
                                        if (!exclude3.matches(fileName2)) {
                                            excludeIter2.remove();
                                        }
                                        else {
                                            exclude3.incr(fileName2);
                                            if (exclude3.wasFinalMatch()) {
                                                matchIter.remove();
                                                continue Label_0352;
                                            }
                                            continue;
                                        }
                                    }
                                    if (excludePatterns.isEmpty()) {
                                        break;
                                    }
                                }
                            }
                            finally {
                                for (final Pattern exclude4 : allExcludePatterns) {
                                    exclude4.reset();
                                }
                            }
                        }
                        break;
                    }
                }
            }

            private void scanDir(final File dir, final List<Pattern> includes) {
                if (!dir.canRead()) {
                    return;
                }
                boolean scanAll = false;
                for (final Pattern include : includes) {
                    if (include.value.indexOf(42) != -1 || include.value.indexOf(63) != -1) {
                        scanAll = true;
                        break;
                    }
                }
                if (!scanAll) {
                    final List matchingIncludes = new ArrayList(1);
                    for (final Pattern include2 : includes) {
                        if (matchingIncludes.isEmpty()) {
                            matchingIncludes.add(include2);
                        }
                        else {
                            matchingIncludes.set(0, include2);
                        }
                        this.process(dir, include2.value, matchingIncludes);
                    }
                }
                else {
                    for (final String fileName : dir.list()) {
                        final List<Pattern> matchingIncludes2 = new ArrayList<Pattern>(includes.size());
                        for (final Pattern include3 : includes) {
                            if (include3.matches(fileName)) {
                                matchingIncludes2.add(include3);
                            }
                        }
                        if (!matchingIncludes2.isEmpty()) {
                            this.process(dir, fileName, matchingIncludes2);
                        }
                    }
                }
            }

            private void process(final File dir, final String fileName, final List<Pattern> matchingIncludes) {
                boolean isFinalMatch = false;
                final List<Pattern> incrementedPatterns = new ArrayList<Pattern>();
                final Iterator iter = matchingIncludes.iterator();
                while (iter.hasNext()) {
                    final Pattern include = (Pattern) iter.next();
                    if (include.incr(fileName)) {
                        incrementedPatterns.add(include);
                        if (include.isExhausted()) {
                            iter.remove();
                        }
                    }
                    if (include.wasFinalMatch()) {
                        isFinalMatch = true;
                    }
                }
                final File file = new File(dir, fileName);
                if (isFinalMatch) {
                    int length = this.rootDir.getPath().length();
                    if (!this.rootDir.getPath().endsWith(File.separator)) {
                        ++length;
                    }
                    this.matches.add(file.getPath().substring(length));
                }
                if (!matchingIncludes.isEmpty() && file.isDirectory()) {
                    this.scanDir(file, matchingIncludes);
                }
                for (final Pattern include2 : incrementedPatterns) {
                    include2.decr();
                }
            }

            public List<String> matches() {
                return this.matches;
            }

            public File rootDir() {
                return this.rootDir;
            }

            public static void main(final String[] args) {
                final List<String> includes = new ArrayList<String>();
                includes.add("website/in*");
                final List<String> excludes = new ArrayList<String>();
                final long start = System.nanoTime();
                final List<String> files = new GlobScanner(new File(".."), includes, excludes, false).matches();
                final long end = System.nanoTime();
                System.out.println(files.toString().replaceAll(", ", "\n").replaceAll("[\\[\\]]", ""));
                System.out.println((end - start) / 1000000.0f);
            }

            static class Pattern
            {
                String value;
                boolean ignoreCase;
                final String[] values;
                private int index;

                Pattern(String pattern, final boolean ignoreCase) {
                    this.ignoreCase = ignoreCase;
                    pattern = pattern.replace('\\', '/');
                    pattern = pattern.replaceAll("\\*\\*[^/]", "****");
                    if (ignoreCase) {
                        pattern = pattern.toLowerCase();
                    }
                    this.values = pattern.split("/");
                    this.value = this.values[0];
                }

                boolean matches(String fileName) {
                    if (this.value.equals("**")) {
                        return true;
                    }
                    if (this.ignoreCase) {
                        fileName = fileName.toLowerCase();
                    }
                    if (this.value.indexOf(42) == -1 && this.value.indexOf(63) == -1) {
                        return fileName.equals(this.value);
                    }
                    int i;
                    int j;
                    for (i = 0, j = 0; i < fileName.length() && j < this.value.length() && this.value.charAt(j) != '*'; ++i, ++j) {
                        if (this.value.charAt(j) != fileName.charAt(i) && this.value.charAt(j) != '?') {
                            return false;
                        }
                    }
                    if (j == this.value.length()) {
                        return fileName.length() == this.value.length();
                    }
                    int cp = 0;
                    int mp = 0;
                    while (i < fileName.length()) {
                        if (j < this.value.length() && this.value.charAt(j) == '*') {
                            if (j++ >= this.value.length()) {
                                return true;
                            }
                            mp = j;
                            cp = i + 1;
                        }
                        else if (j < this.value.length() && (this.value.charAt(j) == fileName.charAt(i) || this.value.charAt(j) == '?')) {
                            ++j;
                            ++i;
                        }
                        else {
                            j = mp;
                            i = cp++;
                        }
                    }
                    while (j < this.value.length() && this.value.charAt(j) == '*') {
                        ++j;
                    }
                    return j >= this.value.length();
                }

                String nextValue() {
                    if (this.index + 1 == this.values.length) {
                        return null;
                    }
                    return this.values[this.index + 1];
                }

                boolean incr(final String fileName) {
                    if (this.value.equals("**")) {
                        if (this.index == this.values.length - 1) {
                            return false;
                        }
                        this.incr();
                        if (!this.matches(fileName)) {
                            this.decr();
                            return false;
                        }
                        this.incr();
                    }
                    else {
                        this.incr();
                    }
                    return true;
                }

                void incr() {
                    ++this.index;
                    if (this.index >= this.values.length) {
                        this.value = null;
                    }
                    else {
                        this.value = this.values[this.index];
                    }
                }

                void decr() {
                    --this.index;
                    if (this.index > 0 && this.values[this.index - 1].equals("**")) {
                        --this.index;
                    }
                    this.value = this.values[this.index];
                }

                void reset() {
                    this.index = 0;
                    this.value = this.values[0];
                }

                boolean isExhausted() {
                    return this.index >= this.values.length;
                }

                boolean isLast() {
                    return this.index >= this.values.length - 1;
                }

                boolean wasFinalMatch() {
                    return this.isExhausted() || (this.isLast() && this.value.equals("**"));
                }
            }
        }

        static class RegexScanner
        {
            private final File rootDir;
            private final List<Pattern> includePatterns;
            private final List<String> matches;

            public RegexScanner(File rootDir, final List<String> includes, final List<String> excludes) {
                this.matches = new ArrayList<String>(128);
                if (rootDir == null) {
                    throw new IllegalArgumentException("rootDir cannot be null.");
                }
                if (!rootDir.exists()) {
                    throw new IllegalArgumentException("Directory does not exist: " + rootDir);
                }
                if (!rootDir.isDirectory()) {
                    throw new IllegalArgumentException("File must be a directory: " + rootDir);
                }
                try {
                    rootDir = rootDir.getCanonicalFile();
                }
                catch (IOException ex) {
                    throw new RuntimeException("OS error determining canonical path: " + rootDir, ex);
                }
                this.rootDir = rootDir;
                if (includes == null) {
                    throw new IllegalArgumentException("includes cannot be null.");
                }
                if (excludes == null) {
                    throw new IllegalArgumentException("excludes cannot be null.");
                }
                this.includePatterns = new ArrayList<Pattern>();
                for (final String include : includes) {
                    this.includePatterns.add(Pattern.compile(include, 2));
                }
                final List<Pattern> excludePatterns = new ArrayList<Pattern>();
                for (final String exclude : excludes) {
                    excludePatterns.add(Pattern.compile(exclude, 2));
                }
                this.scanDir(rootDir);
                final Iterator matchIter = this.matches.iterator();
                while (matchIter.hasNext()) {
                    final String filePath = (String) matchIter.next();
                    for (final Pattern exclude2 : excludePatterns) {
                        if (exclude2.matcher(filePath).matches()) {
                            matchIter.remove();
                        }
                    }
                }
            }

            private void scanDir(final File dir) {
                for (final File file : dir.listFiles()) {
                    for (final Pattern include : this.includePatterns) {
                        int length = this.rootDir.getPath().length();
                        if (!this.rootDir.getPath().endsWith(File.separator)) {
                            ++length;
                        }
                        final String filePath = file.getPath().substring(length);
                        if (include.matcher(filePath).matches()) {
                            this.matches.add(filePath);
                            break;
                        }
                    }
                    if (file.isDirectory()) {
                        this.scanDir(file);
                    }
                }
            }

            public List<String> matches() {
                return this.matches;
            }

            public File rootDir() {
                return this.rootDir;
            }

            public static void main(final String[] args) {
                final List<String> includes = new ArrayList<String>();
                includes.add("core[^T]+php");
                final List<String> excludes = new ArrayList<String>();
                final long start = System.nanoTime();
                final List<String> files = new RegexScanner(new File("..\\website\\includes"), includes, excludes).matches();
                final long end = System.nanoTime();
                System.out.println(files.toString().replaceAll(", ", "\n").replaceAll("[\\[\\]]", ""));
                System.out.println((end - start) / 1000000.0f);
            }
        }

        private static final class Path
        {
            public final String dir;
            public final String name;

            public Path(String dir, final String name) {
                if (dir.length() > 0 && !dir.endsWith("/")) {
                    dir += "/";
                }
                this.dir = dir;
                this.name = name;
            }

            public String absolute() {
                return this.dir + this.name;
            }

            public File file() {
                return new File(this.dir, this.name);
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = 31 * result + ((this.dir == null) ? 0 : this.dir.hashCode());
                result = 31 * result + ((this.name == null) ? 0 : this.name.hashCode());
                return result;
            }

            @Override
            public boolean equals(final Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (this.getClass() != obj.getClass()) {
                    return false;
                }
                final Path other = (Path)obj;
                if (this.dir == null) {
                    if (other.dir != null) {
                        return false;
                    }
                }
                else if (!this.dir.equals(other.dir)) {
                    return false;
                }
                if (this.name == null) {
                    if (other.name != null) {
                        return false;
                    }
                }
                else if (!this.name.equals(other.name)) {
                    return false;
                }
                return true;
            }
        }
    }
}

/*

	Total time: 212 ms
	");
	pattern = pattern.replaceAll("[^/]\\\\", "
*/