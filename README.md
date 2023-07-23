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
        -boolean isStray
        +Dog()
        +Dog(int legs, String color, String species)
        +Dog(int legs, String color, String species, boolean isStray)
        +getIsStray() boolean
        +setIsStray(isStray)
        +speak() String
    }
    class Ant{
          +Ant()
          +Ant(String exoskeleton)
          +speak() String
    }

    class Snake{
          -boolean isVenomous
          +Snake()
          +Snake(String color, String species)
          +Snake(String color, String species, boolean isVenomous)
          +getIsVenomous() boolean
          +setIsVenomous(isVenomous)
          +speak() String
    }
    class Attributes{
          <<interface>>
          +speak()* String
    }
    class Animal{
          <<abstract>>
          +getLegs()* int
          +setLegs(int legs)*
          +getColor()* String
          +setColor(String color)*
          +getSpecies()*
          +setSpecies(String secies)*
    }
    class Arthropod{
          <<abstract>>
          +setExoskeleton()*
          +getExoskeleton()*
    }
  class Insect{
        -String exoskeleton
        +Insect()
        +Insect(String exoskeleton)
        +setExoskeleton(String exoskeleton)
        +getExoskeleton() String
        +speak() String
  }
    class Mammal{
        -int legs
        -String color
        -String species
        +Mammal()
        +Mammal(int legs, String color, String species)
        +getLegs() int
        +setLegs(int legs)
        +getColor() Sting
        +setColor(String color)
        +getSpecies() String
        +setSpecies(String secies)
      }
    class Reptile{
        -int legs
        -String color
        -String species
        +Reptile()
        +Reptile(int legs, String color, String species)
        +getLegs() int
        +setLegs(int legs)
        +getColor() String
        +setColor(String color)
        +getSpecies() String
        +setSpecies(String secies)
        +speak() String
        
    }

```
