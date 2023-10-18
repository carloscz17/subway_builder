package org.subway.modelo;

import org.subway.interfaces.Builder;
import java.util.List;

public class BreadBuilder implements Builder<BreadBuilder, Bread> {

    private final String bread;
    private String filling;
    private List<String> sauce;
    private String more;

    //required
    public BreadBuilder(String b){
        this.bread = b;
    }

    @Override
    public BreadBuilder filling(String r) {
        this.filling = r;
        return this;
    }

    @Override
    public BreadBuilder sauce(List<String> m) {
        this.sauce = m;
        return this;
    }

    @Override
    public BreadBuilder more(String m) {
        this.more = m;
        return this;
    }

    @Override
    public Bread createdBread() {
        Bread bread = new Bread();
        bread.setType_of_bread(this.bread);
        bread.setFilling(this.filling);
        bread.setSauce(this.sauce);
        bread.setMore(this.more);
        return bread;

    }
}