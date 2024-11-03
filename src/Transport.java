// Создали абстрактный класс Транспорт, который имплементирует поведение описанное в интерфейсе.
// В абстрактный класс вынесли свойства общие для всех объектов (модель и кол-во колес),
// и добавили логику для задания поведение

public abstract class Transport implements CherForTransport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
