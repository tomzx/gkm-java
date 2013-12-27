package gkm;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class GlobalListener
{
	public static void main(String[] args) throws InterruptedException
	{
		try
		{
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex)
		{
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalMouseListener globalMouseListener = new GlobalMouseListener();
		GlobalScreen.getInstance().addNativeMouseListener(globalMouseListener);
		GlobalScreen.getInstance().addNativeMouseMotionListener(globalMouseListener);
		GlobalScreen.getInstance().addNativeKeyListener(new GlobalKeyListener());
	}
}
