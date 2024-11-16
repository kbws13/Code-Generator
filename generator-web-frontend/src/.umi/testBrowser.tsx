// @ts-nocheck
// This file is generated by Umi automatically
// DO NOT CHANGE IT MANUALLY!
import React, { useEffect, useState } from 'react';
import { ApplyPluginsType } from 'umi';
import { renderClient, RenderClientOpts } from '/Users/fangyuan/Project/Code-Generator/generator-web-frontend/node_modules/@umijs/renderer-react';
import { createHistory } from './core/history';
import { createPluginManager } from './core/plugin';
import { getRoutes } from './core/route';
import type { Location } from 'history';


import '/Users/fangyuan/Project/Code-Generator/generator-web-frontend/src/global.less';
import '/Users/fangyuan/Project/Code-Generator/generator-web-frontend/src/global.tsx';
import 'antd/dist/reset.css';
const publicPath = '/';
const runtimePublicPath = false;

type TestBrowserProps = {
  location?: Partial<Location>;
  historyRef?: React.MutableRefObject<Location>;
};

export function TestBrowser(props: TestBrowserProps) {
  const pluginManager = createPluginManager();
  const [context, setContext] = useState<RenderClientOpts | undefined>(
    undefined
  );
  useEffect(() => {
    const genContext = async () => {
      const { routes, routeComponents } = await getRoutes(pluginManager);
      // allow user to extend routes
      await pluginManager.applyPlugins({
        key: 'patchRoutes',
        type: ApplyPluginsType.event,
        args: {
          routes,
          routeComponents,
        },
      });
      const contextOpts = pluginManager.applyPlugins({
        key: 'modifyContextOpts',
        type: ApplyPluginsType.modify,
        initialValue: {},
      });
      const basename = contextOpts.basename || '/';
      const history = createHistory({
        type: 'memory',
        basename,
      });
      const context = {
        routes,
        routeComponents,
        pluginManager,
        rootElement: contextOpts.rootElement || document.getElementById('root'),
        publicPath,
        runtimePublicPath,
        history,
        basename,
        components: true,
      };
      const modifiedContext = pluginManager.applyPlugins({
        key: 'modifyClientRenderOpts',
        type: ApplyPluginsType.modify,
        initialValue: context,
      });
      return modifiedContext;
    };
    genContext().then((context) => {
      setContext(context);
      if (props.location) {
        context?.history?.push(props.location);
      }
      if (props.historyRef) {
        props.historyRef.current = context?.history;
      }
    });
  }, []);

  if (context === undefined) {
    return <div id="loading" />;
  }

  const Children = renderClient(context);
  return (
    <React.Fragment>
      <Children />
    </React.Fragment>
  );
}
