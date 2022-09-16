package GoF.Builder;

public interface NetWorkBuilderInterface {
    NetWork.NetWorkBuilder setAddress(String address);
    NetWork.NetWorkBuilder setPort(String port);
    NetWork build();
}
