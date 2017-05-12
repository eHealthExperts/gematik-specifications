# gematik-specifications

Dieses Projekt bietet eine Java-Interpretation der gematik-AFOs, die in diversen gematik-Spezifikationen verteilt sind und durch gematik-Produkttypsteckbriefe querreferenziert werden. Die Umsetzung unterteilt die AFOs in jeweilige Namensräume (Java-Packages) und bietet global entsprechende API-Typen (Interfaces) an.

## Lizenz

Dieses 2016 durch die [eHealth Experts GmbH](http://www.ehealthexperts.de) initiierte Free-Open-Source Projekt wird unter der MIT-Lizenz veröffentlicht. Den Wortlaut der Lizenzvereinbarung finden sie in der beigefügten Datei *[LICENSE](LICENSE)*.

## Versionierung / Release-Umsetzung

Die Versionsnummern der einzelnen Releases referenzieren einen jeweiligen Stand eines gematik-Releases.
- Die Major-Nummer **1** zeigt den Bezug zum gematik Release 1.5 ORS1 mit Basis-Rollout – Erprobung und Produktivbetrieb.
  Die Major-Nummer **2** zeigt den Bezug zum gematik Release 1.6 Online-Produktivbetrieb (Stufe 1) - OPB1.
- Jede Minor-Nummer bezieht sich auf einen bestimmten Dokumentenstand der Produkttypsteckbriefe. Exemplarisch steht **1.0** für eine Umsetzung der ORS-1.5-Dokumente vom 19. Juli 2016.
- Die Patch-Nummer repräsentiert den Programmierumfang des Projekts und kann den jeweiligen Release-Notes entnommen werden. 

|  Version gematik-specifications |                                  Umsetzung von gematik-Release                                  |                                           Version Produkttypsteckbriefe                                          |
|:-------------------------------:|:-----------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1.0.* (Default-Branch)          | [Release 1.5 ORS1](http://www.gematik.de/cms/de/spezifikation/release_1_5_ors1/release_1_5.jsp) | [2016-07-19](http://www.gematik.de/cms/media/dokumente/ors1_release_1_5/ORS1_Produkttypsteckbriefe_20160719.zip)                                                     |
| 1.1.*                           | [Release 1.5 ORS1](http://www.gematik.de/cms/de/spezifikation/release_1_5_ors1/release_1_5.jsp) | [2016-09-22](http://www.gematik.de/cms/media/dokumente/ors1_release_1_5/ORS1_Produkttypsteckbriefe_20160922.zip)                                                     |
| 1.2.*                           | [Release 1.5 ORS1](http://www.gematik.de/cms/de/spezifikation/release_1_5_ors1/release_1_5.jsp) | **TBR**: Vorarbeiten für demnächst erscheinendes gematik-Release aus Release 1.5 ORS1 (*T*o *B*e *R*eleased)                                                                       |
| NO-VERSION                      | Release 1.6 OPB1 (1.6.0)                                                                        |    |
| 2.0.*                           | [Release 1.6 OPB1 (1.6.1)](http://www.gematik.de/cms/de/spezifikation/release_1_6_opb1/release_1_9.jsp) | [2016-08-24](http://www.gematik.de/cms/media/dokumente/opb1_release_1_6/OPB1_Produkttypsteckbriefe_20160824.zip)                                                     |
| 2.1.*                           | [Release 1.6 OPB1](http://www.gematik.de/cms/de/spezifikation/release_1_6_opb1/release_1_9.jsp) | **TBR**: Vorarbeiten für zeitweise erschienenes gematik-Release [2016-11-25](http://www.gematik.de/cms/media/dokumente/opb1_release_1_6/OPB1_Produkttypsteckbriefe_20161125.zip) |
| 2.2.*                           | [Release 1.6 OPB1 (1.6.2)](http://www.gematik.de/cms/de/spezifikation/release_1_6_opb1/release_1_9.jsp) | [2016-12-19](http://www.gematik.de/cms/media/dokumente/opb1_release_1_6/OPB1_Produkttypsteckbriefe_20161219.zip)                                                     |
| 2.3.*                           | [Release 1.6 OPB1 (1.6.3)](http://www.gematik.de/cms/de/spezifikation/release_1_6_opb1/release_1_9.jsp) | [2017-03-20](http://www.gematik.de/cms/media/dokumente/opb1_release_1_6/OPB1_Produkttypsteckbriefe_20170316.zip)                                                     |

## Hinweise für Nutzer der gematik-specifications

Sämtliche konkreten Klassen sind stets gegen passende Interfaces entwickelt. Es wird ganz deutlich darauf hingewiesen, dass diese anstatt der konkreten Typen für sämtliche Methoden-Schnittstellen zu verwenden sind, um an zukünftigen Weiterentwicklungen teilhaben zu können.

Desweiteren sind die gematik-AFOs mit unterschiedlichen Anforderungsleveln versehen. Diese sind grundsätzlich Bestandteil der bereits in den `enum`-Klassen erfassten AFOs. Eine Nichtangabe eines Anforderungslevels impliziert eine *MUSS*-Anforderung. Häufig sind jedoch AFOs erfasst worden ohne deren Anforderungslevel anzugeben, da es sich schlicht nicht aus den Produkttypsteckbriefen bzw. AFO-Titeln herauslesen lässt. Derartige AFOs sind mit einem entsprechenden TODO als Java-Kommentar vermerkt. (Das zur Laufzeit abrufbare Level ist daher ggf. nicht korrekt; In den meisten Fällen handelt es sich bei den gematik-AFOs jedoch um *MUSS*-AFOs.)

## Hinweise für Entwickler der gematik-specifications

Sie sind herzlich eingeladen, selbst zu diesem Projekt beizutragen. Legen Sie sich hierzu einem Fork des Projekts an (shared repository model), arbeiten Sie Ihre Ergänzungen ein und tragen Sie diese als Pull-Request an dieses Projekt heran.
- Bitte beachten Sie die Code-Konventionen. 
- Zudem sind alle `enum`-Konstanten alphabetisch sortiert (plus [Trailing-Komma](http://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.9)), um die Code-Änderungen schneller überblicken zu können.
- Arbeiten Sie stets gegen die Interfaces.
- Jeder Code-Beitrag muss, wenn er eine neue Funktionalität beiträgt, durch passende Unit-Tests (oder sogar [j8unit](https://github.com/j8unit-team/j8unit)-Tests) überprüfbar sein.
- Mehr Informationen zu einem github-Pull-Request über Fork-Grenzen hinweg finden sie unter: https://help.github.com/articles/about-pull-requests/
