package gkm;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class GlobalKeyListener implements NativeKeyListener
{
	public void nativeKeyPressed(NativeKeyEvent e)
	{
		System.out.println("key.pressed:" + e.getKeyText(e.getKeyCode()));
	}

	public void nativeKeyReleased(NativeKeyEvent e)
	{
		System.out.println("key.released:" + e.getKeyText(e.getKeyCode()));
	}

	public void nativeKeyTyped(NativeKeyEvent e)
	{
		System.out.println("key.typed:" + e.getKeyText(e.getKeyCode()));
	}
}