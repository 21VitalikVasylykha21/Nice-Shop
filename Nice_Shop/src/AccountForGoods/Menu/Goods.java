package AccountForGoods.Menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Vitalik
 */
public class Goods implements GoodsIntarfase {

    String Name;
    String Producer;
    int Index;
    int Quantity;
    double Price;

    public void Goods(int Index, String Name, int Quantity, double Price, String Producer) {
        this.Index = Index;
        this.Name = Name;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Producer = Producer;
    }

    public String GoToGson(Goods Goods) {
        return GSON.toJson(Goods);
    }

    public Goods FromGson(String Info, Goods Goods) {
        return GSON.fromJson(Info, Goods.class);
    }

    public String ReadGsonFile(String Path) {
        try {
            String JsonFile = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(Path), "UTF-8"));
            while (in.ready()) {
                JsonFile += in.readLine();
            }
            in.close();
            return JsonFile;
        } catch (IOException e) {
            System.out.println("Виникла помилка в системі:" + e);
        }
        return "";
    }
    
    public void WriteGsonFile(String Path, String content) {
        try {
            OutputStreamWriter Writer = new OutputStreamWriter(new FileOutputStream(Path, false), "UTF-8");
            Writer.write(content);
            Writer.close();
        } catch (IOException e) {
            System.out.println("Виникла помилка в системі:" + e);
        }
    }

    @Override
    public int GetIndex() {
        return Index;
    }

    @Override
    public String GetName() {
        return Name;
    }

    @Override
    public int GetQuantity() {
        return Quantity;
    }

    @Override
    public double GetPrice() {
        return Price;
    }

    @Override
    public String GetProducer() {
        return Producer;
    }

    @Override
    public void SetIndex(int Index) {
        this.Index = Index;
    }

    @Override
    public void SetName(String Name) {
        this.Name = Name;
    }

    @Override
    public void SetQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public void SetPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public void SetProducer(String Producer) {
        this.Producer = Producer;
    }

}
