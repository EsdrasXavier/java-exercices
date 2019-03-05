JFLAGS=
JC=javac
.SUFIXES: .java .class

SOURCES := $(shell find . -name '*.java')

CLASSES := $(SOURCES:%.java=%.class)

default: classes

classes: $(SOURCES)
	$(JC) $(JFLAGS) $(SOURCES)

clean:
	$(RM) ./*/*.class

