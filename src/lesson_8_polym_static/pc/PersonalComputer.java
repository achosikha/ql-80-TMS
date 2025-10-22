package lesson_8_polym_static.pc;

public class PersonalComputer {
    // BLOCK
    // Сам БЛОК
    // Материнская плата
    // Процессор
    // Оперативная память
    // Винчестер
    // Кулер
    // Видео карта

    // Ключевое слово - final это местный аналог const т.е. неизменяемой переменной
    // Вы задаете значение в момент создания переменной и больше не можете менять его значение
    // final int birthDate = 1988; НАДО СРАЗУ ЖЕ УКАЗАТЬ ЗНАЧЕНИЕ
    // ЕГО НЕЛЬЗЯ БУДЕТ БОЛЬШЕ НИГДЕ И НИКОГДА МЕНЯТЬ
    private final PCBlock block;
    private final BaseBoard baseBoard;
    private final Processor processor;
    private final RAM ram;
    private final Cooler cooler;
    private final HDD hdd;
    private final VGA vga;

    // this вне конструктора - обозначает ВЫЗОВИ САМОГО СЕБЯ, под this будет ссылка на собственное
    // пространство в КУЧЕ
    public PersonalComputer(PCBlock block, BaseBoard baseBoard, Processor processor, RAM ram,
                            Cooler cooler, HDD hdd, VGA vga) {
        // block = block; // присвой локальной переменной block локальную переменную block
        this.block = block;
        this.baseBoard = baseBoard;
        this.processor = processor;
        this.ram = ram;
        this.cooler = cooler;
        this.hdd = hdd;
        this.vga = vga;
    }

    @Override
    public String toString() {
        return "PC:\n" +
                "\tBlock:\n" + this.block + "\n" + // PersonalComputer -> myPC (address) -> block = 0x49ef.block
                "\tBaseboard:\n" + this.baseBoard + "\n" +
                "\tProcessor:\n" + this.processor + "\n" +
                "\tRAM:\n" + this.ram + "\n" +
                "\tCooler:\n" + this.cooler + "\n" +
                "\tHDD:\n" + this.hdd + "\n" +
                "\tVGA:\n" + this.vga + "\n" +
                "\t" + this.getClass().getSimpleName() + " is being stored in a heap: "; // ADD ADDRESS ? CAN BE **
        // Почему я не могу вывести адрес экземпляра класса в метод toString()
    }
}