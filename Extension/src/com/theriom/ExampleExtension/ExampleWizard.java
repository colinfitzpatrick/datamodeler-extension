package com.theriom.ExampleExtension;

import javax.swing.JOptionPane;

import oracle.ide.Context;
import oracle.ide.wizard.Wizard;

/**
 * Implementation of the "Example" gallery item.
 */
public final class ExampleWizard
  extends Wizard
{

  public boolean invoke(Context context)
  {
	JOptionPane.showMessageDialog(null, "Menu Invoked");
	return true;
  }


  @Override
  public boolean isAvailable(Context context)
  {
	return true;
  }

  @Override
  public String getShortLabel()
  {
	return "Example";
  }
}
