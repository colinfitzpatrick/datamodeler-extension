package com.theriom.ExampleExtension;

import oracle.ide.Context;
import oracle.ide.controller.Controller;
import oracle.ide.controller.IdeAction;
import oracle.ide.wizard.WizardManager;

/**
 * Controller for action Example.
 */
public final class ExampleController
  implements Controller
{
  public boolean update(IdeAction action, Context context)
  {
	action.setEnabled(true);
	return true;
  }

  public boolean handleEvent(IdeAction action, Context context)
  {
	WizardManager.getInstance().getWizard(ExampleWizard.class).invoke(context);
	return true;
  }
}
