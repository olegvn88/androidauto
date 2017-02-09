package com.java.test;

import com.att.automation.lattice.sdk.action.ActionResult;
import com.att.automation.lattice.sdk.agent.AndroidAgent;
import com.att.automation.lattice.sdk.reporter.GlobalReporter;

/**
 * Created by onesterov on 09.02.2017.
 */
public class Test1 {

    public static void main(String[] args) {
        GlobalReporter.setDebug(true);

        AndroidAgent agent = new AndroidAgent("DFW_TGuardAgent");
        ActionResult result = agent.actions.GetViewRefByText("Login", null);
        String ref = result.getOutputParameter();

        agent.actions.ClickByRef(ref);

    }

}
