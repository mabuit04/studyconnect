## BDD-Tests mit Cucumber  
Zum Testen der Userstories mit Hilfe der Gherkin Syntax wird Cucumber verwendet: https://cucumber.io/  
Die Dependencies müssen entsprechend der Dokumentation in der pom.xml hinzugefügt werden. Als hilfreich für das Dependeny-Management hat sich die Verwendung der cucumber-bom und junit-bom herausgestellt.   

## Task.feature  
Die Gherkin Syntax wird in der Datei '/studyconnect/backend/src/test/resources/features/Task.feature' hinterlegt. Unter "Background" kann eine Vorbedingung, die für alle Szenarien gleich gilt, festgelegt werden. In unserem Beispiel sollte der User auf den sich die Szenarios beziehen eingeloggt sein.  
  
"Given" signalisiert dann die Bedingung für das konkrete Szenario bspw. muss für das Bearbeiten einer Aufgabe die Vorbedingung erfüllt sein, dass überhaupt eine Aufgabe vorhanden ist.  
"When" ist das Schlüsselwort für die Aktion des Benutzers also bspw. klickt der Benutzer auf "neue Aufgabe erstellen"  
"Then" beschreibt, was darauf im Idealfall passieren soll. Also die Aufgabe wird angelegt oder die Exportfunktion wird aufgerufen.  

Aus einem Issue kann relativ leicht eine Userstory erstellt werden. "User Henry möchte bei einem Verbindungsabbruch benachrichtigt werden dass seine Aufgabe nicht abgespeichert wurde". Hier zeigt sich die Stärke der BDD-Tests, weil sich dieser seltene Ausnahmefall dort gut integrieren und somit abprüfen lässt.

## TaskSteps.java  
Abgelegt unter  
'backend/src/test/java/de/studyconnect/backend/steps/TaskSteps.java'
setzt die Gherkin Syntax in Programmbefehle um. Dazu wird jedem Prosatext aus der Task.feature ein Programmschnipsel zugeordnet, welcher genau das ausführt, was im Text beschrieben wird. Dazu werden die Annotation @Given, @When usw. verwendet, damit Cucumber den entsprechenden Programmcode ausführen kann beim Ablauf der Tests.

## TaskCucumberTest.java
'backend/src/test/java/de/studyconnect/backend/runner/TaskCucumberTest.java'  
In dieser Datei wird der Aufruf der Tests mit Cucumber gemanaged. Dazu wird beispielsweise eingestellt, wo die feature-Dateien zu finden sind und wo die steps-Dateien. Die Notwendigkeit der Einstellungen ergibt sich aus der Integration von Cucumber in Springboot.

## Häufigkeit der BDD-Tests
BDD-Tests sind extrem aufwendig zu erstellen und zu implementieren, insbesondere wenn es viele Userstories gibt, bzw. wenn das Programm sehr umfangreich ist. Andererseits kann sich durch eine detaillierte Ausarbeitung der Tests eine deutlich höhere Programmqualität ergeben, wenn wirklich alle Userstories dort überprüft werden. Die Ausführung der BDD-Tests dauert länger, dies ist allerdings nur von Belang, wenn es sich um ein großes Programm handelt. In unserem Beispiel ist der zeitliche Mehraufwand beim automatisierten Testen (mwv test) vernachlässigbar. Generell lässt sich aber sagen, dass die BDD-Tests weniger häufig als die Unit-Tests durchgeführt werden sollten. Dies ergibt sich auch aus den Empfehlungen der Test-Pyramide, da BDD-Tests zu den Integration Tests zählen und dort eher in der Mitte der Pyramide angesiedelt sind.