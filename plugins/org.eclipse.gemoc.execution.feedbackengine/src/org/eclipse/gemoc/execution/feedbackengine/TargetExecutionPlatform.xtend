package org.eclipse.gemoc.execution.feedbackengine

import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionPlatform
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon

class TargetExecutionPlatform implements IExecutionPlatform {

	val Collection<IEngineAddon> addons = new ArrayList<IEngineAddon>

	override getEngineAddons() {
		synchronized (_addonLock) {
			return Collections.unmodifiableCollection(new ArrayList<IEngineAddon>(addons));
		}
	}

	override dispose() {
		addons.clear();
	}

	private Object _addonLock = new Object();

	override addEngineAddon(IEngineAddon addon) {
		synchronized (_addonLock) {
			addons.add(addon);
		}
	}

	override removeEngineAddon(IEngineAddon addon) {
		synchronized (_addonLock) {
			addons.remove(addon);
		}
	}

	override getModelLoader() {
		throw new UnsupportedOperationException()
	}

}
