package io.github.jackowski626.notchsplashadder;

import io.github.jackowski626.splashesapi.SplashesAPI;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PreLaunch implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        System.out.println("Entry point test");
    }
}
