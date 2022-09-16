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

    // Объявляем теже поля, что и в требуемом классе
        private String address;
        private String port;

    // Геттеры для ображения к полям
        public String getAddress() {
            return address;
        }

        public String getPort() {
            return port;
        }
        NetWork netWork = new NetWork();
    // Далее два метода, которые установят поля классу NetWorkBuilder
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
        NetWork netWork = new NetWork.NetWorkBuilder().setPort("8080").build();
        System.out.println(netWork);
    }
}
