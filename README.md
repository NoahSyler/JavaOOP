# JavaOOP
Project displaying OOP concepts
```mermaid
classDiagram
    note "UML Diagram"
  
    Attributes <|.. Arthropod
    Attributes <|.. Animal
    Animal <|-- Reptile
    Animal <|-- Mammal
    Arthropod <|-- Insect
    Reptile <|-- Snake
    Mammal <|-- Dog
    Insect <|-- Ant

    class Dog{
      -bool isStray
      +Dog()
      +Dog(int legs, String color, String species)
      +Dog(int legs, String color, String species, boolean isStray)
      +getIsStray()
      +setIsStray(isStray)
      +speak()
    }
    class Ant{
      +Ant()
      +Ant(String exoskeleton)
      +speak()
    }

    class Snake{
      -bool isVenomous
      +Snake()
      +Snake(String color, String species)
      +Snake(String color, String species, boolean isVenomous)
      +getIsVenomous()
      +setIsVenomous(isVenomous)
      +speak()
    }
    class Attributes{
      <<interface>>
      +speak()*
    }
    class Animal{
      <<abstract>>
      +getLegs()*
      +setLegs(int legs)*
      +getColor()*
      +setColor(String color)*
      +getSpecies()*
      +setSpecies(String secies)*
    }
    class Arthropod{
      <<abstract>>
      setExoskeleton()*
      getExoskeleton()*
    }
  class Insect{
      setExoskeleton()
      getExoskeleton()
  }
  class Mammal{
    -int legs
    -String color
    -String species
    Mammal()
    Mammal(int legs, String color, String species)
    +getLegs()
    +setLegs(int legs)
    +getColor()
    +setColor(String color)
    +getSpecies()
    +setSpecies(String secies)
    
  }

```
