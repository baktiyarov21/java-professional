package test.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private int page;
    private PopularMovie[] result;

    public Result(int page, PopularMovie[] result) {
        this.page = page;
        this.result = result;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public PopularMovie[] getResult() {
        return result;
    }

    public void setResult(PopularMovie[] result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "page=" + page +
                ", result=" + result +
                '}';
    }
}
