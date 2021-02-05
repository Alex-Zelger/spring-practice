package az.com.practicum.springpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TestController {
    public History hist = new History();
    List<History> hList = new ArrayList<History>();

    @GetMapping("/add/{int1}/{int2}")
    public int add(@PathVariable int int1, @PathVariable int int2){
        hist.setHistory(int1, int2, '+');
        hList.add(hist);
        return int1 + int2;
    }

    @GetMapping("/sub/{int1}/{int2}")
    public int sub(@PathVariable int int1, @PathVariable int int2){
        hist.setHistory(int1, int2, '-');
        hList.add(hist);
        return int1 - int2;
    }

    @GetMapping("/mult/{int1}/{int2}")
    public int mult(@PathVariable int int1, @PathVariable int int2) {
        hist.setHistory(int1, int2, '*');
        hList.add(hist);
        return int1 * int2;
    }

    @GetMapping("/div/{int1}/{int2}")
    public int div(@PathVariable int int1, @PathVariable int int2){
        hist.setHistory(int1, int2, '/');
        hList.add(hist);
        return int1 / int2;
    }

    @GetMapping("/history")
    public String getHistory(){
        String retHistory = "";

        for (int i =0; i < hList.size(); i++){
            retHistory = retHistory + hist.getHistory() + "\n";
        }

        return retHistory;
    }

    @GetMapping("/delete")
    public String deleteHistory(){
        int items = hList.size();
        hList.clear();
        return items + " item(s) deleted";
    }

}
