

public class DataStorage<T>{
    T data;

    public DataStorage(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public static void main(String[] args) {
        DataStorage<Integer> rs = new DataStorage<>(100);
        DataStorage<String> res = new DataStorage<>("Good");

        System.out.println(rs.getData());
        System.out.println(res.getData());
    }
}