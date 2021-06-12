package AccountForGoods.Menu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;

/**
 *
 * @author Vitalik
 */
public class Shops {

    String ShopName;
    final Gson GSONN = new GsonBuilder().setPrettyPrinting().create();

    public void SetName(String Name) {
        this.ShopName = Name;
    }

    public String GetName() {
        return ShopName;
    }

    public void AddCashier(String Name, double Rate, String CashRegister, String Path) {
        Cashier i = new Cashier();
        i.SetCashier(Name, Rate, CashRegister);
        i.WriteGsonFile(Path + "\\" + Name + ".json", i.GoToGson(i));
    }

    public void Remove(String PathToFile) {
        File geleteFile = new File(PathToFile);
        recursiveDelete(geleteFile);
    }

    private void recursiveDelete(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
        }
        file.delete();
    }

    public String GoToJson(Shops.Cashier Cashier) {
        return GSONN.toJson(Cashier);
    }

    public Shops.Cashier FromJson(String Info, Shops.Cashier Cashier) {
        return GSONN.fromJson(Info, Shops.Cashier.class);
    }

    public String ReadJsonFile(String Path) {
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

    public void WriteFile(String Path, String content) {
        try {
            OutputStreamWriter Writer = new OutputStreamWriter(new FileOutputStream(Path, false), "UTF-8");
            Writer.write(content);
            Writer.close();
        } catch (IOException e) {
            System.out.println("Виникла помилка в системі:" + e);
        }
    }

    public class Cashier {

        String Name;
        double Rate;
        String CashRegister;
        double Sell = 0;

        public void SetCashier(String Name, double Rate, String CashRegister) {
            this.Name = Name;
            this.Rate = Rate;
            this.CashRegister = CashRegister;
        }

        public void SetName(String Name) {
            this.Name = Name;
        }

        public void SetRate(double Rate) {
            this.Rate = Rate;
        }

        public void SetCashRegister(String CashRegister) {
            this.CashRegister = CashRegister;
        }

        public String GetName() {
            return Name;
        }

        public double GetRate() {
            return Rate;
        }

        public String GetCashRegister() {
            return CashRegister;
        }

        public void Selling(double S) {
            Sell += S;
        }

        public String ReadGsonFile(String Path) {
            return ReadJsonFile(Path);
        }

        public String GoToGson(Shops.Cashier Cashier) {
            return GoToJson(Cashier);
        }

        public void WriteGsonFile(String Path, String content) {
            WriteFile(Path, content);
        }

        public Shops.Cashier FromGson(String Info, Shops.Cashier Cashier) {
            return FromJson(Info,Cashier );
        }

        public void Report(String Path, Shops s) {
            Date date = new Date();
            String Content = "Магазин: " + s.ShopName + "\n"
                    + "Продавець: " + Name + "\n"
                    + "Каса: " + CashRegister + "\n"
                    + "Ставка: " + Rate + "\n"
                    + "Часом на: " + date + " продав: " + Sell + "\n";

            s.WriteFile(Path, Content);
        }
    }
}
