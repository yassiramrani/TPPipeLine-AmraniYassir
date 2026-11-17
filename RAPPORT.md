# Compte rendu · JenkinsPipeLine

**Yassir Amrani · EMSI Tanger · DevOps 2026/2027**

Le TP automatise la compilation, les tests et le conditionnement d’un programme Java. Le programme accepte un nom facultatif, supprime les espaces en début et fin et utilise un nom par défaut si l’argument est absent ou vide.

| Étape | Vérification |
| --- | --- |
| Checkout | Le script récupère le commit associé au job et affiche son identifiant. |
| Build | Maven compile les classes en ciblant Java 17. |
| Test, package et exécution | Trois cas vérifient la valeur de retour. Si un cas échoue, le conditionnement s’arrête. Le JAR construit est ensuite exécuté et archivé. |

Le job Pipeline vise la branche main. Le déclenchement manuel permet de vérifier les étapes ainsi que l’artefact archivé.

## Exécution vérifiée

Jenkins 2.528.2, Maven 3.9.11 et JDK 21, avec compilation ciblant Java 17. Les builds ont utilisé une copie locale des branches déjà publiées sur GitHub. Jenkins a archivé le JAR après les trois vérifications.

| Branche | Commit testé | Vérifications | Sortie du JAR | Jenkins |
| --- | --- | --- | --- | --- |
| `main` | `e8a5153b2a15` | 3/3 | `Bonjour, DevOps !` | SUCCESS |

