package mum.edu.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
    private static final long serialVersionUID = 748392348L;
    private Integer add1;
    private Integer add2;
    private Integer sum;

    public Integer getAdd1() {
        return add1;
    }
    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public Integer getAdd2() {
        return add1;
    }
    public void setAdd2(Integer add2) {
        this.add1 = add2;
    }

    public Integer getSum() {
        return this.add1 + this.add2;
    }
}
