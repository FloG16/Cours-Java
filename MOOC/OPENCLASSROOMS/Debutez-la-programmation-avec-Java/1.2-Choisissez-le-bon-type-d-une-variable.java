/*Pourquoi avons-nous besoin de types de données ?

Dans le chapitre précédent, vous avez découvert les types de données. Mais il reste encore tellement de choses à apprendre ! 
Pour commencer, pourquoi avons-nous donc besoin de types de données ?

Tout d'abord, la seule façon de déclarer une variable en Java est de spécifier directement son type. Regardons la déclaration suivante de la variable  count  :

Pour la déclarer, il faut commencer par le type, puis le nom, et enfin la valeur. Si vous n'avez pas de valeur à assigner à votre variable au moment de la déclaration,
vous devez quand même utiliser le mot clé définissant le type, par exemple  int.

Par exemple, si vous voulez compter des mots dans une phrase, mais que vous ne savez pas encore de quelle phrase il s'agit, indiquez le type et déclarez la variable 
pour une utilisation future. Cependant, lorsque vous déclarez une variable en spécifiant uniquement son type, celle-ci ne peut pas être utilisée tant qu'on ne lui a 
pas attribué une valeur. En programmation, il est souvent nécessaire de déclarer une variable en sachant que vous lui attribuerez une valeur plus tard.

Si je ne peux pas utiliser une variable sans valeur, pourquoi donc j'ai besoin de spécifier le type ? Pourquoi pas uniquement la valeur ? 🧐

Pendant l'exécution d'un programme, votre CPU (unité centrale de traitement) a besoin de savoir combien d'espace réserver à votre variable. Utiliser un type pour 
déclarer une variable permet à votre CPU de lui allouer un espace mémoire adapté.

Le CPU est comme le chef d'orchestre de votre ordinateur, c'est lui qui cadence tous les traitements nécessaires au bon fonctionnement de vos programmes.

Parmi les types de données, il existe les types primitifs. Ce sont des types qui existent par eux-même, comme des atomes

Les types les plus simples servent de base à toutes les opérations informatiques.

Il est possible de les combiner pour construire des types plus complexes, comme nous le verrons dans le chapitre suivant.

Parmi les types primitifs, vous serez souvent amené à utiliser les types numériques et les chaînes. Parlons-en un peu !
Découvrez les types numériques

Les types numériques sont :

    les nombres entiers, comme les nombres que vous utilisez pour compter (1, 2, 3) ;

    les nombres décimaux, que vous pouvez utiliser pour stocker les valeurs monétaires (2,50 ou 5,99 par exemple).

Les entiers

Commençons par un type que vous connaissez déjà bien : les entiers ! Les entiers sont déclarés comme n'importe quelle autre variable, avec un type, puis un nom, puis, 
si vous l'avez, une valeur :*/

int count = 10;

/*Vous reconnaissez le mot clé  int  du dernier chapitre ?

C'est parce que vous déclarez des entiers avec le mot clé type  int. Votre variable  count  a un type entier. Et sa valeur est de 10, qui est... un nombre entier ! 😉
Les décimales

Pour les décimales, Java utilise deux types différents :

    float ;

    double.

Ces deux types ont le même but. La différence est que  double  est deux fois plus précis que  float, ce qui signifie qu'il propose plus de décimales d'un nombre 
après la virgule.

Si vous avez besoin de stocker quelque chose de grand, comme un numéro à 12 chiffres  1876.79797657, vous devrez utiliser  double. En effet,  float  ne pourra stocker 
que la moitié de ce chiffre... Le reste serait tronqué et perdu à tout jamais !

Pour une précision jusqu'à 2 décimales après la virgule, vous pouvez utiliser  float.  Au-delà, ce sera  double.

Ces types sont déclarés et initialisés de la façon suivante :*/

float length = 1876.79;

double width = 1876.79797657;

/*Mais que se passe-t-il si je fournis des valeurs supérieures ?

Par exemple :*/

double a = 1876.79797657765609870978709780987;

float b = 1876.79797657765609870978709780987;

//h bien, elles vont perdre toutes les deux un peu de précision, mais pas au même degré :

// a -> 1876.797976

 // b -> 1876.79

//Avec des valeurs plus petites, cela ne fait aucune différence :

float length = 10.0;

double width = 10.0;

/*ns l'exemple ci-dessus, les deux variables contiennent de petites valeurs. Sur la deuxième ligne, nous utilisons simplement  double  au lieu de  float. Comme cela 
ne fait aucune différence fonctionnelle, je vous encourage à utiliser la plus petite dans cet exemple, puisque l'utilisation d'une plus grande boîte pour stocker les
petites valeurs gaspille de la mémoire !

La plupart du temps, quand vous développez un programme, vous ne contrôlez pas forcément la précision des variables que vous aurez à traiter. C'est pourquoi, 
en pratique, vous constaterez que la plupart des programmeurs Java utilisent le type  double.
Mélangez des types numériques

Dans vos programmes, vous pouvez être amené à faire des opérations mathématiques. Cependant, les variables utilisées ne seront pas forcément de même type 
(tant qu'elles restent des valeurs numériques). C'est pourquoi  il est important de garder à l'esprit la façon dont les types se mélangent et les conséquences 
que cela peut avoir. Par exemple, si vous divisez deux nombres :  5/2, on s'attendrait logiquement à un résultat de  2,5. Mais pour l'ordinateur, ce n'est pas si 
évident que ça et vous pourriez obtenir  2  de façon assez inattendue !

Vous voyez ? Les ordinateurs ne sont pas aussi intelligents que nous !

Passons en revue quelques exemples dans Java :*/

int a = 10;

int b = 4;

int c = a/b;

/*vinez quel sera le résultat de la division ?

Eh bien, c'est  2  – pas forcément ce à quoi on s'attendait, n'est-ce pas ?

Cela est dû au fait que les variables  a  et  b  se sont vu assigner des nombres entiers (int). Ainsi, l'opération de division ne peut fournir qu'un nombre entier 
comme réponse.

Une division entre deux entiers s'appelle une division entière. Elle a toujours pour résultat un nombre entier.

Mais que se passera-t-il avec le code ci-dessous ?*/

int a = 10;

int b = 4;

double c = a/b;

/*tte fois,  c  va pouvoir stocker un nombre décimal. Cependant, l'expression  a/b  divise toujours un  int  avec un autre  int. Donc  c  se verra assigné le 
résultat de la division entière. Ce qui fait, encore une fois, 2.

Zut...Cela ne fonctionne toujours pas. 😫

Pour obtenir un résultat avec des décimaux, il va falloir combiner deux types.*/

int a = 10;

double b = 4;

int c = a/b;

/* voyez comment la variable  a  été déclarée avec  int  et la variable  b  avec  double ?

Dans cet exemple, le résultat de l'expression  a/b  sera bien un nombre décimal,  2,5.

Cependant,  c  est déclaré comme un  int  et ne peut pas se voir attribuer une valeur décimale. Cette affectation n'est pas possible !

Vous pouvez faire en sorte qu'une variable d'un type agisse comme un autre type. C'est ce qu'on appelle le type casting (ou la conversion d'une valeur dans un autre 
type). Pour résoudre le problème que nous avons eu dans le dernier exemple, faites croire à la variable  b  que c'est un entier en l'assignant à  c  comme ci-dessous :*/

int a = 10;

double b = 4;

int c = a/ (int) b; //-> c contient 2, car a /(int) b est une division entière

/*Vous voyez comment nous avons fait pour que la variable  b  agisse comme un nombre entier ? Vous pouvez aussi faire en sorte qu’une variable entière  b fasse 
comme si sa valeur était  double  :*/

int a = 10;

int b = 4;

double c = a/(double) b; //-> c contient 2.5, car la valeur de b est transformée en double

/*Convertir une variable en  double  vous permet d'effectuer une division en virgule flottante, même si vous utilisez des variables avec un type entier  int.

Découvrez les chaînes de caractères (strings)

Passons maintenant à un type plus complexe, les strings. Les strings (ou chaînes de caractères) permettent de stocker du texte, ou en d'autres termes, un ensemble 
de caractères. Voici comment déclarer une variable string dans Java :*/

String city = "New York";

String movie = "Best ever";

String pet;

String emptyString = "";

//Vous pouvez fusionner une ou plusieurs d'entre elles. Rassemblons quelques  strings  :

String firstFavoriteCity = "New York";

String secondFavoriteCity = "Buenos Aires";

String favorites = firstFavoriteCity + secondFavoriteCity; // -> "New YorkBuenos Aires"

/*Mais, il n'y a pas d'espace entre les deux. C'est bizarre, non ?

Rendons ce code plus lisible en concaténant, c'est-à-dire en mettant bout à bout des chaînes de caractères et des variables :*/

String firstFavoriteCity = "New York"

String secondFavoriteCity = "Buenos Aires"


String favorites = "My favorite cities are " +firstFavoriteCity+ " and "+secondFavoriteCity; // -> "My favorite cities are New York and Buenos Aires"

/*C'est beaucoup mieux maintenant ! Vous pouvez également concaténer d'autres types de données avec des chaînes de caractères, telles que des nombres.

Ah oui ? Mais comment je procède ?*/

String favoriteCity = "Buenos Aires";

int numberOfTrips = 5;


String story = "I've traveled to " +favoriteCity+ " " +numberOfTrips+ " times!"; // -> "I've traveled to Buenos Aires 5 times!"
/*Juste avant, nous avons utilisé l'opérateur  +  pour ajouter deux nombres. Ici, avec des chaînes de caractères, l'opérateur  +  peut être utilisé pour concaténer 
des chaînes et des nombres entiers. La concaténation fait référence à l'assemblage de chaînes de caractères ou de nombres, et de chaînes de caractères.
En résumé

Dans ce chapitre, vous avez appris les particularités de quelques types de données simples :

    nombre entiers (mot-clé  int) ;

    nombres décimaux (mots clés  float  et  double) ;

    chaînes de caractères (mot clé  String).

Vous avez aussi appris à manipuler ces types :

    vous pouvez effectuer des opérations numériques sur des nombres du même type ;

    pour utiliser ensemble des nombres de types différents dans les opérations, utilisez cast pour qu'ils se comportent comme le type nécessaire ;

    les chaînes peuvent être mises bout à bout. Cela s'appelle la concaténation.

Dans le chapitre suivant, nous aborderons la fonction main ; c'est le point d'entrée de votre programme.*/

