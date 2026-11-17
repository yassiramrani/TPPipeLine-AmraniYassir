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
4. Ajouter les captures de la vue des étapes et de la console Jenkins à ce README, puis remettre le lien GitHub dans Classroom.

## Résultats vérifiés

Compilation avec le compilateur Java 21 ciblant Java 17, trois vérifications et exécution du JAR. Les journaux du dossier `verification/` proviennent des commandes Java lancées localement. L’exécution Maven et les captures d’une exécution Jenkins restent à valider.

Voir [le compte rendu](RAPPORT.md).
