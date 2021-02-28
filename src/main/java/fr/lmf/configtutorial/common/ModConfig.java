package fr.lmf.configtutorial.common;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ModConfig {

    public static class Client {
        public final ForgeConfigSpec.BooleanValue test;
        public final ForgeConfigSpec.BooleanValue test2;

        public final ForgeConfigSpec.IntValue test3;

        Client(ForgeConfigSpec.Builder builder) {
            //Category client
            builder.push("client");

            //Category test
            builder.push("test");

            test = builder
                    .comment("Comment for test 1")
                    .define("test1", false);

            //End of test category
            builder.pop();

            //Category test2
            builder.push("test2");

            test2 = builder
                    .comment("Comment for test 2")
                    .define("test2", true);

            //End of test2 category
            builder.pop();
            //End of client category
            builder.pop();

            //Category client2
            builder.push("client2");

            test3 = builder
                    .comment("Comment for test 3")
                    .defineInRange("test3", 4, 1, 70);

            //End of client2 category
            builder.pop();

        }
    }

    public static final ForgeConfigSpec clientSpec;
    public static final ModConfig.Client CLIENT;
    static {
        final Pair<ModConfig.Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ModConfig.Client::new);
        clientSpec = specPair.getRight();
        CLIENT = specPair.getLeft();
    }

}
