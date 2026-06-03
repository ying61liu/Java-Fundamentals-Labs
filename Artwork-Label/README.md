Given main(), define the Artist class (in file Artist.java) with constructors to initialize an artist's information, 
get methods, and a printInfo() method. 
The default constructor should initialize the artist's name to "unknown" and the years of birth and death to -1. 
printInfo() displays "Artist:", then a space, then the artist's name, then another space, then the birth and death dates 
in one of three formats:

(XXXX to YYYY) if both the birth and death years are nonnegative
(XXXX to present) if the birth year is nonnegative and the death year is negative
(unknown) otherwise

Define the Artwork class (in file Artwork.java) with constructors to initialize an artwork's information, get methods, 
and a printInfo() method. 
The default constructor should initialize the title to "unknown", the year created to -1. 
printInfo() displays an artist's information by calling the printInfo() method in Artist.java, 
followed by the artwork's title and the year created. Declare a private field of type Artist in the Artwork class.