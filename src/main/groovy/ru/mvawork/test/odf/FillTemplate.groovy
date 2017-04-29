package ru.mvawork.test.odf

import org.odftoolkit.simple.TextDocument
import org.odftoolkit.simple.text.Paragraph

println "Start"

TextDocument document = TextDocument.loadDocument("template.odt")

Paragraph paragraph = document.getParagraphByIndex(0, false)

TextDocument doc1 = TextDocument.loadDocument("template1.odt")
Paragraph p1 = doc1.getParagraphByIndex(0, false)
doc1.removeParagraph(p1)

document.insertContentFromDocumentBefore(doc1, paragraph, true)


TextDocument doc2 = TextDocument.loadDocument("template2.odt")
p1 = doc2.getParagraphByIndex(0, false)
doc2.removeParagraph(p1)
document.insertContentFromDocumentBefore(doc2, paragraph, true)

TextDocument doc3 = TextDocument.loadDocument("template3.odt")
Paragraph p3 = doc3.getParagraphByIndex(0, false)
doc3.removeParagraph(p3)

document.insertContentFromDocumentBefore(doc3, paragraph, true)

document.removeParagraph(paragraph)
document.save("Сводный документ.odt")


println 'stop'