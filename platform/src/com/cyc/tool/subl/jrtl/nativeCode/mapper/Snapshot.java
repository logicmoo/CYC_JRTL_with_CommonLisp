//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.mapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Snapshot {
    public interface SnapShootingFilter {
        boolean skipValue(SubLObject p0);
    }

    public interface SnapShootingListener {
        void noteSymbol(String p0, String p1, SubLObject p2);

        void skippedSymbol(String p0, String p1, SubLSymbol p2, Exception p3);

        void skippedSymbol(String p0, String p1, SubLSymbol p2, StackOverflowError p3);

        void skippedSymbol(String p0, String p1, SubLSymbol p2, String p3);
    }

    public Snapshot(SubLStream out) {
        this.out = out;
        serializerFunction = SubLPackage.CYC_PACKAGE.retrieveSymbol(SubLObjectFactory.makeString("CFASL-OUTPUT"));
        positionFunction = SubLPackage.CYC_PACKAGE.retrieveSymbol(SubLObjectFactory.makeString("FILE-POSITION"));
        repositionFunction = SubLPackage.SUBLISP_PACKAGE.toPackage()
                .retrieveSymbol(SubLObjectFactory.makeString("SET-FILE-POSITION"));
        listeners = new ArrayList<SnapShootingListener>();
        filters = new ArrayList<SnapShootingFilter>();
    }

    private static boolean filterValue(List<SnapShootingFilter> filters, SubLObject value) {
        for (SnapShootingFilter filter : filters)
            if (filter.skipValue(value))
                return true;
        return false;
    }

    public static void snapShoot(Snapshot snapShot) throws IOException {
        snapShot.snapShootPackage(SubLPackage.CYC_PACKAGE);
    }

    private SubLStream out;
    private SubLSymbol serializerFunction;
    private SubLSymbol positionFunction;
    private SubLSymbol repositionFunction;
    private List<SnapShootingListener> listeners;
    private List<SnapShootingFilter> filters;

    private List<SnapShootingFilter> currentCopyOfFilters() {
        synchronized (filters) {
            return new ArrayList<SnapShootingFilter>(filters);
        }
    }

    private void notifyListeners(String pkgName, String symbolName, SubLObject filePosition) {
        synchronized (listeners) {
            for (SnapShootingListener l : listeners)
                try {
                    l.noteSymbol(pkgName, symbolName, filePosition);
                } catch (Exception xcpt) {
                    System.err.println("Failed to notify listener " + l + " for " + pkgName + ":" + symbolName
                            + " of file position " + filePosition);
                    xcpt.printStackTrace();
                }
        }
    }

    private void notifyListeners(String pkgName, String symbolName, SubLSymbol type, Exception xcpt) {
        synchronized (listeners) {
            for (SnapShootingListener l : listeners)
                try {
                    l.skippedSymbol(pkgName, symbolName, type, xcpt);
                } catch (Exception e) {
                    System.err.println("Failed to notify listener " + l + " of skipped symbol " + pkgName + ":"
                            + symbolName + " due to the following exception: ");
                    xcpt.printStackTrace();
                    System.err.println("Notifying the listerner caused the following exception:");
                    e.printStackTrace();
                }
        }
    }

    private void notifyListeners(String pkgName, String symbolName, SubLSymbol type, StackOverflowError err) {
        synchronized (listeners) {
            for (SnapShootingListener l : listeners)
                try {
                    l.skippedSymbol(pkgName, symbolName, type, err);
                } catch (Exception e) {
                    System.err.println("Failed to notify listener " + l + " of skipped symbol " + pkgName + ":"
                            + symbolName + " due to the following stack overflow: ");
                    err.printStackTrace();
                    System.err.println("Notifying the listerner caused the following exception:");
                    e.printStackTrace();
                }
        }
    }

    private void notifyListeners(String pkgName, String symbolName, SubLSymbol type, String errmsg) {
        synchronized (listeners) {
            for (SnapShootingListener l : listeners)
                try {
                    l.skippedSymbol(pkgName, symbolName, type, errmsg);
                } catch (Exception e) {
                    System.err.println("Failed to notify listener " + l + " of skipped symbol " + pkgName + ":"
                            + symbolName + " due to the following SubL error message: ");
                    System.err.println(errmsg);
                    System.err.println("Notifying the listerner caused the following exception:");
                    e.printStackTrace();
                }
        }
    }

    private void snapShootPackage(SubLPackage pkg) throws IOException {
        SubLThread thread = SubLProcess.currentSubLThread();
        String packageName = pkg.getName();
        List<SnapShootingFilter> currFilters = currentCopyOfFilters();
        boolean hasFilters = !currFilters.isEmpty();
        SubLSymbol errorMessageHandler = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        SubLSymbol errorMsgTarget = SubLPackage.CYC_PACKAGE
                .retrieveSymbol(SubLObjectFactory.makeString("*CATCH-ERROR-MESSAGE-TARGET*"));
        List<SubLSymbol> candidates = pkg.worldInitializedSymbols();
        for (SubLSymbol symbol : candidates) {
            String symbolName = symbol.getName();
            SubLObject value = symbol.getGlobalValue();
            SubLSymbol type = Types.type_of(value);
            boolean candidate = !hasFilters || !filterValue(currFilters, value);
            if (candidate) {
                SubLObject position = Functions.funcall(positionFunction, out);
                boolean success = false;
                try {
                    thread.throwStack.push(errorMsgTarget.getGlobalValue());
                    SubLObject prevErrHandler = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(errorMessageHandler, thread);
                        try {
                            SubLObject prevCerrorFlag = Errors.$continue_cerrorP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind(SubLNil.NIL, thread);
                                Functions.funcall(serializerFunction, value, out);
                                this.notifyListeners(packageName, symbolName, position);
                                success = true;
                            } catch (StackOverflowError err) {
                                this.notifyListeners(packageName, symbolName, type, err);
                            } finally {
                                Errors.$continue_cerrorP$.rebind(prevCerrorFlag, thread);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, SubLNil.NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(prevErrHandler, thread);
                    }
                } catch (Throwable ccatch_env_var) {
                    SubLObject errmsg = Errors.handleThrowable(ccatch_env_var, errorMsgTarget.getGlobalValue());
                    this.notifyListeners(packageName, symbolName, type, errmsg.getStringValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (success)
                    continue;
                Functions.funcall(repositionFunction, out, position);
            }
        }
    }

    public void addFilter(SnapShootingFilter filter) {
        synchronized (filters) {
            filters.add(filter);
        }
    }

    public void addListener(SnapShootingListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    public void removeFilter(SnapShootingFilter filter) {
        synchronized (filters) {
            filters.remove(filter);
        }
    }

    public void removeListener(SnapShootingListener listener) {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }

    public void snapShoot() throws IOException {
        snapShoot(this);
    }
}
