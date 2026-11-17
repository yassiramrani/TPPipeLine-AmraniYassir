# TP JenkinsPipeLine

Yassir Amrani · EMSI Tanger · 5DDSIT G1

## Objectif

Construire et vérifier une application Java avec un pipeline Jenkins versionné. Le pipeline récupère le commit du job, compile l'application avec Maven, exécute les vérifications et archive le JAR.

## Exécution locale

Prérequis pour Maven et l'agent Jenkins : JDK 17 ou 21, Git et Maven 3.9.x. Les plugins Pipeline, Git et Timestamper sont nécessaires. Le TP Multibranch utilise aussi GitHub Branch Source.

```sh
mvn -B clean package
java -jar target/tp-pipeline.jar
```

## Configuration Jenkins

1. Créer le dépôt GitHub `TPPipeLine-AmraniYassir` et pousser la branche `main`.
2. Dans Jenkins, créer un élément de type **Pipeline**, puis sélectionner **Pipeline script from SCM** → **Git**. Renseigner l'URL du dépôt, `*/main` et le chemin `Jenkinsfile`. Pour un dépôt privé, sélectionner les identifiants dans Jenkins.
3. Lancer **Build Now**. Vérifier les trois étapes, le message `Bonjour, DevOps !` dans la console et le JAR dans les artefacts.

## Résultats vérifiés

Jenkins 2.528.2, Maven 3.9.11 et JDK 21, avec compilation ciblant Java 17. Les builds ont utilisé une copie locale des branches déjà publiées sur GitHub. Jenkins a archivé le JAR après les trois vérifications.

| Branche | Commit testé | Vérifications | Sortie du JAR | Jenkins |
| --- | --- | --- | --- | --- |
| `main` | `e8a5153b2a15` | 3/3 | `Bonjour, DevOps !` | SUCCESS |

Voir [le compte rendu](RAPPORT.md).
