import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;


import java.util.ArrayList;
import java.util.List;

public class Demo {

    private final String string;

    public Demo(String s){
        this.string=Preconditions.checkNotNull(s);
    }

    List<String> list = Lists.newArrayListWithCapacity(4);
    List<Integer> listImmutable = ImmutableList.of(1,2,3,3,5);
}
