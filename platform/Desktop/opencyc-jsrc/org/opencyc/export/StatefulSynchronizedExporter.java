package org.opencyc.export;

/**
 * Exporter class for which the export method is synchronized, and
 * state is maintained during the export.
 * @param <T> The type of object that this exporter exports.
 * @author baxter
 */
public abstract class StatefulSynchronizedExporter<T> implements Exporter<T> {

  /** The object being exported. * */
  protected T object;

  @Override
  public final synchronized void export(T object) throws ExportException {
    try {
      initializeState(object);
      doExport();
    } catch (Exception e) {
      throw new ExportException(e);
    } finally {
      finalizeState();
    }
  }

  /**
   * Set up state prior to export.
   *
   * @param object the object being exported
   * @throws ExportException
   */
  protected void initializeState(T object) throws ExportException {
    this.object = object;
  }

  /**
   * Perform the export proper.
   *
   * @throws ExportException
   */
  abstract protected void doExport() throws Exception;

  /**
   * Clean up state following export.
   *
   * @throws ExportException
   */
  protected void finalizeState() throws ExportException {
  }
}
