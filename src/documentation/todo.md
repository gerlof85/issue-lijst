# Globaal stappenplan

- [x] aanmaken Java project

- [x] mappen aanpassen bij buildpath config (src/main/java)

- [x] pom kopiëren + groupid aanpassen

- [x] project naar Git map verplaatsen

- [x] importeren als Existing Maven project (omdat er POM bij zit)

- [x] git ignore toevoegen

- [ ] class met CSV functionaliteit aanmaken (met juiste imports)

- [ ] JUnit test aanmaken

- [x] Add class Status
- [x] Add class Priority
- [x] Add class IssueType
- [x] Add class IssueId
- [ ] Add class Issue (elk issue komt in afzonderlijk object)

- [ ] Add class voor uitlezen csv file


- [ ] Jar builden

- [ ] project op Github plaatsen


## Ontwerp classes issue lijst
Voorbeeld in CSV formaat:
issue-id; issue-type; priority; status; creation-date; description
sample-10; bug; medium; open; 2015.10.30; This seams to happen
sample-12; improvement; low; open; 2015.11.15; It would be nice if...


- [ ] class voor het openen van het bestand
- [ ] class voor het vullen van de detailregels
<ol>
 <li>vullen van de koptekst op 1e regel</li>
 <li>loop voor het vullen van de detailregels</li>
</ol>
- [ ] class voor het sluiten van het bestand