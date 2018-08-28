package datadog.trace.instrumentation.http_url_connection;

import datadog.trace.agent.tooling.context.InstrumentationContextBean;

public class Ctx {
  public static <T extends InstrumentationContextBean> T get(Object instance, Class<T> extensionClass) {
    return null;
  }
}
