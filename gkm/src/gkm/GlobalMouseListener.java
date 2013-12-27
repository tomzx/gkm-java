package gkm;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

public class GlobalMouseListener implements NativeMouseInputListener
{
	public void nativeMouseClicked(NativeMouseEvent e)
	{
		System.out.println("mouse.click:" + e.getClickCount());
	}

	public void nativeMousePressed(NativeMouseEvent e)
	{
		System.out.println("mouse.pressed:" + e.getButton());
	}

	public void nativeMouseReleased(NativeMouseEvent e)
	{
		System.out.println("mouse.released:" + e.getButton());
	}

	public void nativeMouseMoved(NativeMouseEvent e)
	{
		System.out.println("mouse.moved:" + e.getX() + "," + e.getY());
	}

	public void nativeMouseDragged(NativeMouseEvent e)
	{
		System.out.println("mouse.dragged:" + e.getX() + "," + e.getY());
	}
}