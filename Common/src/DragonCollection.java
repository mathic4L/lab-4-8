import dragon.Dragon;

import java.util.TreeSet;

public class DragonCollection {
    private TreeSet<Dragon> dragons = new TreeSet<>();

    /**
    info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)
    */

    /**
    show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении
     */


    /**
     show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении
    */
    public void show() {
        dragons.forEach(System.out::println);
    }
    //to string

    /**
     add {element} : добавить новый элемент в коллекцию
     */
    public boolean add(Dragon dragon) {
        dragons.
        return dragons.add(dragon);
    }

    /**
     update id {element} : обновить значение элемента коллекции, id которого равен заданному
     модификацию и удаление конкретного объекта следует разрешать только создавшему объект пользователю.

     */


    /**
     remove_by_id id : удалить элемент из коллекции по его id
     модификацию и удаление конкретного объекта следует разрешать только создавшему объект пользователю.
     */

    /**
     clear : очистить коллекцию
     */

    /**
     save : сохранить коллекцию в файл
     */


    /**
     execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.
     */


    /**
     exit : завершить программу (без сохранения в файл)
     */

    /**
     add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции
     */

    /**
     remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный
     */

    /**
     history : вывести последние 12 команд (без их аргументов)
     */

    /**
     remove_any_by_head head : удалить из коллекции один элемент, значение поля head которого эквивалентно заданному
     */

    /**
     sum_of_age : вывести сумму значений поля age для всех элементов коллекции
     */

    /**
     print_unique_type : вывести уникальные значения поля type всех элементов в коллекции
     */
}


