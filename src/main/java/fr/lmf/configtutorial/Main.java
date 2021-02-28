package fr.lmf.configtutorial;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod("config-tutorial")
public class Main {

    public Main() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, fr.lmf.configtutorial.common.ModConfig.clientSpec);

    }
}
