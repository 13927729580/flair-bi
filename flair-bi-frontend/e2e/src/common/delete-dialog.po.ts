import { ElementFinder, $ } from 'protractor';
import { Dialog } from './dialog.po';

export class DeleteDialog extends Dialog {


    delete(): void {
        this._submitBtn.click();
    }

    cancel(): void {
        this._dismissBtn.click();
    }

}