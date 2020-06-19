# HelloWorld

Character sheet with a name and one stat
Icons from game-icons.net size 64*64

model package
Character
- inventory is an ArrayList of Items
- skill is an ArrayList of Skill
- origin is an Origin object

Items need to have a name, a statbonus and an Icon (include getters), and a constructor
Skills need a name, an Icon and an int damagevalue (internally based on stat)
Origin (Elf, Dwarf etc) needs a name, an Icon

controller package
Controller class

view package
CharacterGUI based on sketch on whiteboard