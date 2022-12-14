package GoF.Builder;

public class NetWork {

    private String address;
    private String port;

    // Запрещаем создавать экзепляр класса через конструктор (приватный конструктор запретит)
    private NetWork(){
    }

    @Override
    public String toString() {
        return "NetWork{" +
                "address='" + address + '\'' +
                ", port='" + Integer.parseInt(port) + '\'' +
                '}';
    }

    // Создавать экземпляр будет вложенный класс NetWorkBuilder
    static class NetWorkBuilder implements NetWorkBuilderInterface{

        NetWork netWork = new NetWork();
    // Далее два метода, которые установят те поля классу NetWork, которые передадим в качестве аргумента в эти методы
    // и вернут данный класс
        @Override
        public NetWorkBuilder setAddress(String address) {
            netWork.address = address;
            return this;
        }

        @Override
        public NetWorkBuilder setPort(String port) {
            netWork.port = port;
            return this;
        }
    // И метод, который вернет экземпляр требуемого класса
        public NetWork build(){
            return netWork;
        }
    }
}
class Main{
    public static void main(String[] args) {
        // Теперь можно создавать экземпляр класса, заполнять его поля через NetWorkBuilder в любой последовательности
        NetWork netWork = new NetWork.NetWorkBuilder().setPort("8080").setAddress("addres").build();
        System.out.println(netWork);
    }
}
