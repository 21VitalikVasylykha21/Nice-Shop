package AccountForGoods.Menu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Vitalik
 */
public interface GoodsIntarfase {
    final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    
    public int GetIndex();

    public String GetName();

    public int GetQuantity();

    public double GetPrice();
    
    public String GetProducer();
    
    public void SetIndex(int Index);

    public void SetName(String Name);

    public void SetQuantity(int Quantity);

    public void SetPrice(double Price);
    
    public void SetProducer(String Producer);

}
