package src.main.java.comments.cleancode;

/*Here’s an even better example.
 You might not agree with the programmer’s solution to the problem,
 but at least you know what he was trying to do:*/

import java.util.concurrent.atomic.AtomicBoolean;

public class GoodExplanationIntent {
    public void testConcurrentAddWidgets() throws Exception {
        WidgetBuilder widgetBuilder = new WidgetBuilder(new Class[]{BoldWidget.class});
        String text = ”’’’bold text’’’”;
        ParentWidget parent = new BoldWidget(new MockWidgetRoot(), ”’’’ bold text’’’”);
        AtomicBoolean failFlag = new AtomicBoolean();
        failFlag.set(false);

        // This is our best attempt to get a race condition
        // by creating large number of threads.
        for (int i = 0; i < 25000; i) {
            WidgetBuilderThread widgetBuilderThread = new WidgetBuilderThread(widgetBuilder, text, parent, failFlag);
            Thread thread = new Thread(widgetBuilderThread);
            thread.start();
        }
        assertEquals(false, failFlag.get());
    }
}