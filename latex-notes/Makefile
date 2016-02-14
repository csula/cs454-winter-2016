

SRC = slides.tex
PDF = $(SRC:.tex=.pdf)

default: slides

slides:
	pdflatex $(SRC)

clean:
	/bin/rm -f $(PDF)

squeaky: clean
	/bin/rm -f *.log *.aux *.nav *.out *.snm *.toc
	/bin/rm -f *.synctex.gz
