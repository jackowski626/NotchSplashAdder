package io.github.jackowski626.notchsplashadder;

import io.github.jackowski626.splashesapi.SplashesAPI;
import net.fabricmc.api.ModInitializer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotchSplashAdder implements ModInitializer {
	@Override
	public void onInitialize() {
		//Adding splashes
		List<String> splashesToAdd = Stream.of("Notch <3 ez!", "Made by Notch!", "The Work of Notch!", "110813!", "Sexy!").collect(Collectors.toList());
		for (String s : splashesToAdd) {
			SplashesAPI.addSplash(s);
		}

		//Removing existing splashes
		List<String> splashesToRemove = Stream.of("Moderately attractive!").collect(Collectors.toList());
		for (String s : splashesToRemove) {
			SplashesAPI.removeSplash(s);
		}

		//Removing all splashes registered to this point (will not clean any other splashes added after using this api)
		//SplashesAPI.clearSplashes();
	}
}
