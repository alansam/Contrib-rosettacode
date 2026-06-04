
# Executable Library

The NetRexx compiler can generate Java classes and in common with all Java classes,
public methods within each class are available for use by other programs. Packaging
a class in a JAR file effectively crates a library that can be used by any other
Java program. If this file is constructed correctly it can also by delivered as an
"executable JAR file" which can be launched via the `-jar` switch of the java
command. The following command can be used to package the NetRexx Hailstone
Sequence sample as an executable JAR file:

``` sh

    $ jar -cvfe RHailstoneSequence.jar RHailstoneSequence RHailstoneSequence.class 
    added manifest
    adding: RHailstoneSequence.class(in = 2604) (out= 1456)(deflated 44%)

```
Here, the `e` switch causes the `jar` program to add a `Main-Class` property to the
generated jar manifest which now contains the following:

``` text

    Manifest-Version: 1.0
    Created-By: 26.0.1 (Oracle Corporation)
    Main-Class: RHailstoneSequence

```
With this Main-Class property present, launching the program via `java -jar` will cause
Java to attempt to execute the `main()` method of the program specified above
(RHailstoneSequence):

## Java 2.6 Update

Using the latest version of Java, `java -run *jarfile*` does not respect the Java
`CLASSPATH` nor the `java -cp *class path entries*` command line switch and the
the result is that the program fails because it can't find the Rexx classes.

There is a workround that I found onliner; you need to update the jar's manifest
to explicitly provide a `class path:` entry. This entry should list the contents
of CLASSPATH as a **space** delimited list. (The convention on UNIX/Linux & MacOS
is to use the colon as a path delimiter.)

You achieve this piece of magic by creating the jar file as before:

``` sh

    $ jar cvfe RHailstoneSequence.jar RHailstoneSequence RHailstoneSequence.class

```

You must then create a text file with the class path information:

The file can be any name you choose but the contents appear to need to be on
a single line. The example below has been split at convenient places but in
reality it is a single line of text.

### Sample Manifest Update File

``` text

    Class-Path: /usr/local/NetRexx/lib/NetRexxF.jar /usr/local/NetRexx/lib/NetRexxC.jar
    /usr/local/NetRexx/lib/ecj-4.6.3.jar /usr/local/NetRexx/lib/NetRexxF.jar
    /usr/local/NetRexx/lib/NetRexxC.jar /usr/local/NetRexx/lib/ecj-4.6.3.jar

```

then update the jar with the new  manifest information  as follows:

``` sh

    $ uvfm RHailstoneSequence.jar maniupd.cp

```

This adds the `class path:` entry to the manifest and the jar's manifest should look
something like this:

```

     Manifest-Version: 1.0
     Created-By: 26.0.1 (Oracle Corporation)
     Main-Class: RHailstoneSequence
     Class-Path: /usr/local/NetRexx/lib/NetRexxF.jar /usr/local/NetRexx/lib/NetRexxC.jar
      /usr/local/NetRexx/lib/ecj-4.6.3.jar /usr/local/NetRexx/lib/NetRexxF.jar
      /usr/local/NetRexx/lib/NetRexxC.jar /usr/local/NetRexx/lib/ecj-4.6.3.jar

```

Once this is done the `java -jar` command works as expected.

