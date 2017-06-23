[![Build Status](https://travis-ci.org/arnevogt/geoinfo-api.svg?branch=master)](https://travis-ci.org/arnevogt/geoinfo-api)

# KSwe SoSe 2017 - Aufgabe 8

Debugging und Continuous Integration.

## Vorgehensweise

Das vorliegende Programm enthält eine Klassen `JsonWeatherEncoder`. Diese
Klasse wird mit dem entsprechenden Test `JsonWeatherEncoderTest` auf Korrektheit
geprüft. Allerdings scheint sich ein Fehler eingeschlichen zu haben.

Nutze den Debugger deiner IDE, um Schritt für Schritt durch die Methode
`public String encode(Weather obj)` zu navigieren.

Das Ergebnis der Methode soll dem Folgenden JSON entsprechen:

```json
{
  "city": {
    "name": "Bochum",
    "country": "Germany"
  },
  "phenomena": {
    "temperature": {
      "value": 22.3,
      "unit": "C"
    }
  }
}
```

## Interaktives Debugging

* identifiziere den Fehler
* führe Anpassungen durch, damit der Test erfolgreich ausgeführt wird

## Code Coverage

* erstelle die Code Coverage für das gesamte Projekt

## Automatisches Testen

[Travis-CI](https://travis-ci.org/) ist eine [Continuous
Integration](https://de.wikipedia.org/wiki/Kontinuierliche_Integration)-Plattform
für Open-Source-Projekte. Es bietet die Möglichkeit, GitHub-Projekte
automatisiert zu testen.

Sobald ein GitHub-Repository die Datei
[`travis.yml`](https://docs.travis-ci.com/user/getting-started/) enthält
und ein entsprechender
[Service Hook](https://www.objc.io/issues/6-build-tools/travis-ci/#link-travis-and-github)
für das Repository eingerichtet ist, führt Travis automatisch das Kompilieren
des Projekts - inklusive Tests - aus.

* Erstelle einen Fork dieses Repositories
* Logge dich mit deinem GitHub-Account auf [travis-ci.org](https://travis-ci.org/)
ein und aktiviere das `geoinfo-api` Repository
* Erstelle die Datei `.travis.yml` (siehe oben) im Hautpverzeichnis des
Repositories
* Commite die `.travis.yml` und pushe zu GitHub

Travis wird ab nun nach jedem Commit in deinem Repository das Projekt bauen
und bei Fehlern eine Meldung versenden.
