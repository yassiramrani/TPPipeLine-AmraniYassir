# Compte rendu · JenkinsPipeLine

**Yassir Amrani · EMSI Tanger · DevOps 2026/2027**

Le TP automatise la compilation, les tests et le conditionnement d’un programme Java. Le programme accepte un nom facultatif, supprime les espaces en début et fin et utilise un nom par défaut si l’argument est absent ou vide.

| Étape | Vérification |
| --- | --- |
| Checkout | Le script récupère le commit associé au job et affiche son identifiant. |
| Build | Maven compile les classes en ciblant Java 17. |
| Test, package et exécution | Trois cas vérifient la valeur de retour. Si un cas échoue, le conditionnement s’arrête. Le JAR construit est ensuite exécuté et archivé. |

Le job Pipeline vise la branche main. Le déclenchement manuel permet de vérifier les étapes ainsi que l’artefact archivé.

La compilation, les trois vérifications et le lancement du JAR ont été exécutés localement avec les outils Java. Les journaux correspondants sont dans `verification/`. La validation du job Jenkins et ses captures restent à réaliser.
