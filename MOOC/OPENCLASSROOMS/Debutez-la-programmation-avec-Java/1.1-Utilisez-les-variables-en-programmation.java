/*Une donnée placée dans une variable s'appelle une valeur. En utilisant l'analogie des boîtes, différentes boîtes peuvent stocker différentes valeurs. 

Par exemple, vous pouvez utiliser une boîte pour ranger de l'argent pour vos dépenses courantes et une autre pour économiser en vue d'une occasion particulière, 

comme un voyage. Vous pouvez également vider les boîtes ou changer leur contenu quand vous ajoutez ou retirez de l'argent.

Pour savoir à quoi sert chaque boîte, vous devez les étiqueter. Avec la programmation, c'est la même chose : vous attribuez un nom à votre variable.

Le nom d'une variable doit refléter la signification de son contenu, comme des étiquettes sur une boîte. Voici quelques recommandations générales pour la création 
de noms :

    utilisez des noms descriptifs tout au long de votre code.
    Ça risque d'être un peu long ! Cependant, les noms descriptifs sont bien pratiques à long terme pour vous et pour votre équipe, car ils offrent une meilleure 
    lisibilité et facilitent ainsi la compréhension du code pour les autres développeurs. Par exemple, si vous voulez stocker des cookies sans sucres, l'utilisation 
    d'un nom descriptif comme  cookiesSansSucres  est bien plus précis que, disons,  cookies  ou  cookiesSains.

    Soyez complet.
    Évitez si possible d'abréger ou de raccourcir les mots, même si une version plus courte semble évidente. Par exemple,  chiffreDAffairesAnnuel  est préférable à  
    chifAfAnn.

    Suivez une convention d'appellation commune.
    L'une des conventions d'appellation les plus populaires est le Camel Case : une phrase composée de plusieurs mots sans espaces ni ponctuation. Le premier mot 
    est écrit en minuscules et tous les autres mots commencent par une majuscule. Par exemple,  monBudget.
    
Créez une variable avec une déclaration de variable

Pour utiliser une variable dans votre code, vous devez la créer, ou, en langage de développeur, la déclarer. Il existe plusieurs types de variables en Java, qui seront
utilisées en fonction du type de valeur qu'elles contiennent. Nous y reviendrons dans la section "Allez au-delà de l'arithmétique des nombres" à la fin de ce chapitre.

En Java, les variables qui contiennent des nombres sont déclarées en utilisant un mot clé tel que  int  suivi du nom d'une variable et de sa valeur initiale. 
Par exemple :*/

int ongoingAllowance = 500;

int savings = 1000;

/*Ici, nous avons déclaré deux variables :  ongoingAllowance  (allocationEnCours) et  savings  (épargne). Ces variables stockent respectivement les valeurs de 500 et 1 000.

Ici, en plus de la déclaration, nous avons également assigné les valeurs initiales aux variables, c'est-à-dire une valeur de départ que vous fixez.

En Java, le type  int  ne stocke que des nombres entiers. Pas de centimes pour vous ! Si vous voulez utiliser les centimes, vous pouvez utiliser le type  double, 
qui stocke les nombres décimaux (ou « flottants »).

Modifiez la valeur de votre variable avec les opérateurs

Une variable peut varier, c'est-à-dire changer de valeur. Elle porte bien son nom, n'est-ce pas ? :)

Pour la faire varier, vous pouvez effectuer plusieurs opérations.

Reprenons les variables  ongoingAllowance  (allocationEnCours) et  savings  (épargne) de l'exemple précédent. Vous pourriez :

    ajouter de l'argent au montant épargné ;

    soustraire de l'argent aux dépenses en cours ;

    découvrir combien de temps il vous faudra pour atteindre 5 000 euros si vous épargnez 500 euros par mois ;

    découvrir le montant de vos dépenses si vous continuez à ajouter 30 euros par jour pendant une semaine ;

    découvrir le montant de vos dépenses si vous dépensez 10 euros par jour pendant une semaine.

Des problèmes du monde réel avec des solutions de programmation ! 💻 Eh oui, chaque opération fonctionne grâce à des opérateurs arithmétiques :

    +  addition ;

    -  soustraction ;

    *  multiplication ;

    /  division.

Les règles arithmétiques habituelles s'appliquent en code ! Et notamment l'ordre d'exécution !

Tout comme en mathématiques, vous pouvez utiliser des parenthèses pour décider de ce qui se passe, et quand. Voyons comment vous pouvez atteindre votre objectif en 
Java :*/

public class MyVariable {


    public static void main(String[] args) {

    int savings = 500;

    int ongoingAllowance = 2000;


        //Ajoutez 100 à votre épargne (Yeah!)

        savings = savings + 100;

        

        //Enlevez 50 à votre indemnité (Snif)

        ongoingAllowance = ongoingAllowance - 50;

        

        //Faites une mise à jour sur votre délai d'épargne

        int numberOfDaysToSave = (5000 - ongoingAllowance) / 500;

        

        //Mettez à jour à nouveau votre indemnité (encore)

        ongoingAllowance = ongoingAllowance + (30 - 10) * 7;

    }

}


/*Regardez ce joli bloc de code ! Notez que toutes les lignes ne se ressemblent pas. Notez que les lignes qui commencent par  //  sont des commentaires. 
Elles servent à aider un autre humain à comprendre le code.

Ici, chaque affectation assigne une valeur à une variable. Une affection est composée de trois éléments :

    l'opérateur d'affectation est  =  ;

    à gauche de l'opérateur d'affectation, vous écrivez le nom de la variable à laquelle vous voulez que le résultat corresponde ;

    à droite de l'opérateur d'affectation, vous écrivez une expression. Une expression est une affectation qui produit une valeur.

Est-ce qu'on peut résumer ? :)

Oui ! Pour affecter une valeur à une variable, vous écrivez une affectation. Cette affectation se compose du nom de la variable, suivie de l'opérateur d'affectation, 
et enfin de l'expression qui produit une valeur correspondant au type de la variable.
Écrivez un code plus court avec des opérateurs d'affectation raccourcis

Chaque affectation attribue une valeur à une variable. Vous pouvez directement assigner une valeur à droite de l'opérateur d'affectation. Voici une exemple :*/

//remplacez la variable épargne par le nouveau montant

savings = 10000;

/*D'ailleurs, lorsque vous avez besoin de changer la valeur d'une variable avec des opérateurs de base et de l'affecter à cette variable, vous pouvez utiliser une 
version raccourcie ! Voici un exemple. Au lieu d'utiliser  savings + 100  et l'opérateur d'affectation  =, vous pouvez utiliser un opérateur d'affectation joint à 
l'opérateur arithmétique  +=  :*/

// Version d'affectation normale

savings = savings + 100;


// Version raccourcie d'affectation

savings += 100;

/*Les autres variantes courtes sont :

    +=  addition ;

    -=  soustraction ;

    *=  multiplication ;

    /=  division.
    
Allez au-delà de l'arithmétique des nombres

Dans l'exemple que nous avons utilisé, toutes les variables stockent des montants d'argent, qui sont des nombres.

Quels autres types de valeurs pouvons-nous affecter aux variables ?

La bonne nouvelle, c'est que nous pouvons stocker n'importe quel type de donnée dans des variables ! 😀

Jusqu'à présent, vous avez vu les composantes suivantes d'une variable : nom et valeur. Enfin, pour pouvoir stocker différents contenus dans les boîtes (ou bocaux), 
vous devez définir le type de la variable. Tout comme le stockage de l'argent nécessite un conteneur différent de celui d'un livre, différentes variables utilisent 
également un espace de stockage différent en fonction de leur type.

Supposons que vous soyez en train de travailler sur une application d'écriture et que vous ayez besoin d'analyser du texte et de calculer ce qui suit :

    le nombre de voyelles présentes dans le texte ;

    le pourcentage de voyelles.

Vous pouvez décomposer le processus comme suit :

    Demandez du texte à l'utilisateur. 🆒

    Parcourez le texte fourni par l'utilisateur caractère par caractère. 🔍

    Augmentez votre total à chaque fois que vous trouvez une voyelle. ➕

    Divisez le nombre final de voyelles par le nombre total de caractères de la chaîne pour obtenir le pourcentage.➗

    Multipliez ce résultat par 100 pour le pourcentage final. ✖️

De combien de variables auriez-vous besoin pour y parvenir ? Pensez au nombre d'informations individuelles que vous devez stocker :

    La séquence initiale de caractères que vous demandez à l'utilisateur (une chaîne ou string).

    Le nombre de voyelles présentes dans la chaîne.

    Le pourcentage de voyelles.

On dirait que vous avez besoin de trois variables ! Pour définir chacune d'entre elles, vous avez besoin des composants suivants :

    Un nom, pour que vous puissiez trouver l'information ultérieurement.

    Une valeur initiale, qui vous donnera un point de départ.

    Un type, qui définira le type de variable que vous avez : chaîne (texte), entier (nombre entier), ou décimal (virgule flottante).

     

Vous en saurez bientôt plus sur les types de variables !

Pour l'instant, il suffit de connaître ces 3 variables :*/

    String = texte

    int = nombre entier

    double = nombre en virgule flottante 

//En Java, vous pouvez déclarer vos trois variables comme ceci ://

String text = "A wonderful string that consists of multiple characters"

int numberOfVowels = 0

double percentageOfVowels = 0.0

/*Veuillez noter que lorsque vous affectez une valeur à une variable lors de sa déclaration, vous devez indiquer explicitement le type de variable dont il s'agit. 
Pour ce faire, ajoutez le type dans votre déclaration en utilisant les mots clés int, String ou double dans notre cas ci-dessus.
Découvrez des variables qui ne changent jamais

Jusqu'à présent, la plupart des valeurs changeaient en fonction des circonstances (ajouter de l'argent aux économies, augmenter le nombre de voyelles). 
Certaines valeurs, cependant, n'ont pas besoin d'être modifiées. Elles restent exactement telles qu'elles ont été définies au départ. Une variable avec une valeur 
qui ne change pas s'appelle une constante. Tout comme les autres variables, les constantes sont décrites par trois composantes : nom, valeur et type. 
La seule différence est qu'une fois que vous l'avez définie, la valeur d'une constante ne peut plus être modifiée.

L'utilisation de constantes est utile pour deux raisons :

    Elles permettent aux programmes d'être plus rapides. L'ordinateur sait combien d'espace une constante prend. Cela signifie que lorsqu'il effectue des opérations, 
    il n'a pas besoin de vérifier les valeurs alternatives.

    Vérifiez que certaines valeurs ne changent pas, que ce soit intentionnellement ou par accident. Par exemple, vous ne voudriez pas modifier les jours de la semaine 
    ou le nombre de jours dans une année. 📅

Lorsque vous codez, il est recommandé d'utiliser des constantes dans la mesure du possible.

Déclarons quelques constantes et voyons comment elles fonctionnent. Pour déclarer une constante en Java, vous devez utiliser le mot clé final :*/

final int numberOfWeekdays = 7;

final String myFavouriteFood = "Icecream";


int numberOfPets = 1;

String currentSeason = "Winter";

/*Il y a des variables et des constantes dans l'exemple ci-dessus. Si vous essayez de modifier les valeurs de toutes ces variables, seules les variables passeront 
et les constantes généreront des erreurs :*/

numberOfWeekdays = numberOfWeekdays + 1; // Error

myFavouriteFood = "Cake"; // Error


numberOfPets = 3; // Ok

currentSeason = "Summer"; // Ok

/*Si vous regardez le fonctionnement des variables dans différents langages de programmation, vous allez probablement remarquer quelques différences. Il est important 
de les connaître lorsque vous commencez à programmer dans un environnement spécifique. Cependant, vous observerez aussi beaucoup de similitudes. 
Bien que les variables puissent sembler différentes d'un langage à l'autre, les concepts restent les mêmes. Ne l'oubliez pas si vous décidez de commencer à programmer
dans un autre langage.*/
