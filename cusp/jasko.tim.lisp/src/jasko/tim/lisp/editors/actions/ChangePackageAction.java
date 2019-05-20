package jasko.tim.lisp.editors.actions;

import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.editors.outline.LispOutlinePage;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.views.ReplView;

public class ChangePackageAction  extends LispAction  {

	public ChangePackageAction() {
		
	}
	public ChangePackageAction(ILispEditor editor) {
		super(editor);
	
	}
	
	private String prevPackage = "COMMON-LISP-USER";
	
	public void run() {
		int offset = getOffset();
		LispEditor editor = (LispEditor) LispPlugin.getActiveEditor();
		if (offset>0&&editor!=null) {
			
			LispOutlinePage page = editor.getOutlinePage();
			if (page==null) {
				editor.createOutline(false);
				//kk, so it flickers, but i don't feel like digging into the code
				//to figure out how to initialize the outline without turning it on then off
				//I suggest thee to simply keep the outline minimized on the side instead of exiting
				page = editor.getOutlinePage();
				if (page==null) {
					//Shouldn't ever get here
					return;
				}
			}
			String pack = editor.getOutlinePage().getPackage(offset);
			String formattedPack = LispUtil.formatCuspPackageName(pack);
			ReplView view = (ReplView) LispPlugin.findView(ReplView.ID);
			if (formattedPack.equalsIgnoreCase(getCusp().getPackage())) {
				String newPrevPackage = getCusp().getPackage();
				//Should never happen????
				if (prevPackage==""||prevPackage==null) 
					prevPackage = "COMMON-LISP-USER";
				view.switchPackageIfExists(prevPackage);
				prevPackage = newPrevPackage;
			} else if (view!=null) {
				String currentPack = getCusp().getPackage();
				if (view.switchPackageIfExists(pack)) {
					prevPackage = LispUtil.formatCuspPackageName(currentPack);
				}
			}
						
		}
	}

  

    
}
