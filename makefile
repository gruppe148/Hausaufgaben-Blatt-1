JAVAC=javac
JAVA=java
JCFLAGS=
JRFLAGS=
export openout_any=a
TEX=xelatex
TEXFLAGS=--shell-escape --output-directory=tex

all:
	$(JAVAC) $(JCFLAGS) $(JFLAGS) PSE_2012_U_1_Sl_19_Grp_148.java
run:
	$(JAVAC) $(JCFLAGS) PSE_2012_U_1_Sl_19_Grp_148.java
	$(JAVA) $(JRFLAGS) PSE_2012_U_1_Sl_19_Grp_148
pdf:
	mint_project
	$(TEX) $(TEXFLAGS) ./tex/PSE_2012_U_1_Sl_19_Grp_148.tex
	rm PSE_2012_U_1_Sl_19_Grp_148.pyg
open-pdf:
	mint_project
	$(TEX) $(TEXFLAGS) ./tex/PSE_2012_U_1_Sl_19_Grp_148.tex && open ./tex/PSE_2012_U_1_Sl_19_Grp_148.pdf
	rm PSE_2012_U_1_Sl_19_Grp_148.pyg
doc:
	javadoc *.java -d ./doc
clean:
	rm PSE_2012_U_1_Sl_19_Grp_148.class
	rm PSE_2012_U_1_Sl_19_Grp_148.{aux,log,pdf}
